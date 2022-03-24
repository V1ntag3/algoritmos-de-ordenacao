package algoritmosDeOrdenacao;

public class MergeSort {

	public static void sort(int[] A, int p, int r) {
		if (p < r) {
			int q = (int) p + r / 2;
			sort(A, p, q);
			sort(A, q + 1, r);
			Merge(A, p, q, r);
		}

	}

	public static void Merge(int[] A, int p, int q, int r) {
		int n = q - p + 1;
		int m = r - q;

		int L[] = new int[n + 1];
		int R[] = new int[m + 1];
		int i, j, k;

		for (i = 0; i < n; i++) {
			L[i] = A[p + i];
		}
		for (j = 0; j < m; j++) {
			R[j] = A[q + j + 1];
		}

		L[n] = 999;
		R[m] = 999;

		i = 0;
		j = 0;
		for (k = p; k <= r; k++) {

			if (L[i] <= R[j]) {
				A[k] = L[i];
				i = i + 1;
			} else {
				A[k] = R[j];
				j = j + 1;

			}
		}

  
	}
}
