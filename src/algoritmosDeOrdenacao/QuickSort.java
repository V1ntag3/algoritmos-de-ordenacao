package algoritmosDeOrdenacao;

public class QuickSort {

	public static void sort(int A[], int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			sort(A, p, q - 1);
			sort(A, q + 1, r);
		}
	}

	public static int partition(int A[], int p, int r) {
		int troca;
		int x = A[p];
		int i = p;
		for (int j = p + 1; j <= r; j++) {
			if (A[j] <= x) {
				i = i + 1;
				troca = A[i];
				A[i] = A[j];
				A[j] = troca;
			}
		}
		troca = A[p];
		A[p] = A[i];
		A[i] = troca;
		return i;
	}
}
//OK