package algoritmosDeOrdenacao;

public class QuickSort {

	public void quickSort(int A[], int p, int r) {
		if(p<r) {
		int q = partition(A, p, r);
		quickSort(A, p, q - 1);
		quickSort(A, q + 1, r);
		}
	}

	public int partition(int A[], int p, int r) {
		int troca;
		int x = A[r];
		int i = p - 1;
		for (int j = p; j < r - 1; j++) {
			if (A[j] <= x) {
				i = i + 1;
				troca = A[i];
				A[i] = A[j];
				A[j] = troca;
			}
		}
		troca = A[i + 1];
		A[i + 1] = A[r];
		A[r] = troca;
		return i + 1;
	}
}
//OK