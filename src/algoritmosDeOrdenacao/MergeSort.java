package algoritmosDeOrdenacao;

public class MergeSort {
	public int comparacoes;

	public MergeSort() {
		this.comparacoes = 0;
	}

	public void sort(int[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			sort(A, p, q);
			sort(A, q + 1, r);
			merge(A, p, q, r);
		}
		return;
	}

	public  void merge(int[] A, int p, int q, int r) {
		int n = q - p + 2;
		int m = r - q + 1;

		int[] L = new int[n];
		int[] R = new int[m];
		L[n - 1] = 999999999;
		R[m - 1] = 999999999;
		int i, j, k;

		for (i = 0; i < n - 1; i++) {
			L[i] = A[p + i];
		}
		for (j = 0; j < m - 1; j++) {
			R[j] = A[q + j + 1];
		}

		i = 0;
		j = 0;
		for (k = p; k <= r; k++) {
			this.comparacoes++;
			if (L[i] < R[j]) {
				A[k] = L[i];
				i = i + 1;
			} else {
				A[k] = R[j];
				j = j + 1;

			}
		}
	}

	public int getComparacoes() {
		return this.comparacoes;
	}
}