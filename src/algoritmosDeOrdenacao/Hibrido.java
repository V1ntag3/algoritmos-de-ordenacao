package algoritmosDeOrdenacao;

import java.io.IOException;

public class Hibrido {
	public static int comparacoes = 0;
	static int[] A = null;
	static int tamHeap;
	
	public static void mergeSort(int[] A, int p, int r) {
		comparacoes++;
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q + 1, r);
			merge(A, p, q, r);
		}
		return;
	}

	public static void merge(int[] A, int p, int q, int r) {
		int n = q - p + 2;
		int m = r - q + 1;

		int[] L = new int[n];
		int[] R = new int[m];
		L[n - 1] = 999999999;
		R[m - 1] = 999999999;
		int i, j, k;

		for (i = 0; i < n - 1; i++) {
			L[i] = A[p + i];
			comparacoes++;
		}
		comparacoes++;
		for (j = 0; j < m - 1; j++) {
			comparacoes++;
			R[j] = A[q + j + 1];
		}
		comparacoes++;

		i = 0;
		j = 0;
		for (k = p; k <= r; k++) {
			comparacoes++;
			comparacoes++;
			if (L[i] < R[j]) {
				A[k] = L[i];
				i = i + 1;
			} else {
				A[k] = R[j];
				j = j + 1;

			}
		}
		comparacoes++;
	}


		
	public static void heapSort(int[] b) {
		tamHeap = b.length;
		A = b;
		int trocar;
		constroiHeapMax(A);
		for (int i = A.length - 1; i > 0; i--) {
			comparacoes++;
			trocar = A[0];
			A[0] = A[i];
			A[i] = trocar;
			tamHeap--;
			refazHeapMax(A, 0);
		}
		comparacoes++;
	}

	public static void constroiHeapMax(int[] A) {
		for (int i = (A.length / 2) - 1; i >= 0; i--) {
			comparacoes++;
			refazHeapMax(A, i);
		}
		comparacoes++;
	}

	private static void refazHeapMax(int[] A, int i) {
		int trocar;
		int e = (2 * i) + 1;// determinar filho da esquerda
		int d = (2 * i) + 2;// determinar filho da direita
		int maior = i;
		comparacoes++;
		if (e < tamHeap && A[e] > A[maior]) maior = e;
		
		comparacoes++;
		if (d < tamHeap && A[d] > A[maior]) maior = d;
		
		comparacoes++;
		if (maior != i) {
			trocar = A[i];
			A[i] = A[maior];
			A[maior] = trocar;
			refazHeapMax(A, maior);
		}

	}
	
	public static void sort(int array[]) {
		if(array.length < 50000) {
			mergeSort(array, 0, array.length - 1);
		}else {
			heapSort(array);
		}
	}

	public static void main(String[] args) throws IOException {
		LeitorDeArquivos leitor = new LeitorDeArquivos();
		Registrador registrador = new Registrador();
		double start = 0, finish = 0;
		
		
		int array1[] = leitor.lerArquivo(100, "100-D.txt");
		start = System.nanoTime();
		sort(array1);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 100, "decrescente");
		
		int array2[] = leitor.lerArquivo(1000, "1000-D.txt");
		start = System.nanoTime();
		sort(array2);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 1000, "decrescente");
		
		int array3[] = leitor.lerArquivo(5000, "5000-D.txt");
		start = System.nanoTime();
		sort(array3);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 5000, "decrescente");
		
		int array4[] = leitor.lerArquivo(30000, "30000-D.txt");
		start = System.nanoTime();
		sort(array4);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 30000, "decrescente");
		
		int array6[] = leitor.lerArquivo(50000, "50000-D.txt");
		start = System.nanoTime();
		sort(array6);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 50000, "decrescente");
		
		int array7[] = leitor.lerArquivo(100000, "100000-D.txt");
		start = System.nanoTime();
		sort(array7);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 100000, "decrescente");
		
		int array8[] = leitor.lerArquivo(150000, "150000-D.txt");
		start = System.nanoTime();
		sort(array8);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 150000, "decrescente");
		
		int array9[] = leitor.lerArquivo(200000, "200000-D.txt");
		start = System.nanoTime();
		sort(array9);
		finish = System.nanoTime();
		registrador.registrar("Hibrido", comparacoes, ((finish - start) / 10E6), 1, 200000, "decrescente");
	
	
	}

}










