package algoritmosDeOrdenacao;

public class HeapSort {
	static int[] A = null;
	static int tamHeap;

	public static void sort(int[] b) {
		tamHeap = b.length;
		A = b;
		int trocar;
		constroiHeapMax(A);
		for (int i = A.length - 1; i > 0; i--) {
			trocar = A[0];
			A[0] = A[i];
			A[i] = trocar;
			tamHeap--;
			refazHeapMax(A, 0);
		}
	}

	public static void constroiHeapMax(int[] A) {
		for (int i = (A.length / 2) - 1; i >= 0; i--) {
			refazHeapMax(A, i);
		}
	}

	private static void refazHeapMax(int[] A, int i) {
		int trocar;
		int e = (2 * i)+1;// determinar filho da esquerda
		int d = (2 * i) + 2;// determinar filho da direita
		int maior = i;
		if (e < tamHeap && A[e] > A[maior]) {
			maior = e;
		}
		if (d < tamHeap && A[d] > A[maior]) {
			maior = d;
		}
		if (maior != i) {
			trocar = A[i];
			A[i] = A[maior];
			A[maior] = trocar;
			refazHeapMax(A, maior);
		}

	}
}
