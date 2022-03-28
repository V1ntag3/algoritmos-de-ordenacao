package algoritmosDeOrdenacao;

public class MergeSort {

	public static void sort(int[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			System.out.println("Valor de q: " +q+" p "+p+" r "+r);
			sort(A, p, q);
			sort(A, q + 1, r);
			merge(A, p, q, r);
		}
		return;
	}

	public static void merge(int[] A, int p, int q, int r) {
		int n = q - p + 2;
		int m = r - q + 1;

		int[] L = new int[n];
		int[] R = new int[m];
		L[n - 1] = 999;
		R[m - 1] = 999;
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

			if (L[i] < R[j]) {
				A[k] = L[i];
				i = i + 1;
			} else {
				A[k] = R[j];
				j = j + 1;

			}
		}

		/*
		 * static void merge(int Arr[], int start, int mid, int end) {
		 * 
		 * // create a temp array int temp[] = new int[end - start + 1];
		 * 
		 * // crawlers for both intervals and for temp int i = start, j = mid + 1, k =
		 * 0;
		 * 
		 * // traverse both arrays and in each iteration add smaller of both elements in
		 * // temp while (i <= mid && j <= end) { if (Arr[i] <= Arr[j]) { temp[k] =
		 * Arr[i]; k += 1; i += 1; } else { temp[k] = Arr[j]; k += 1; j += 1; } }
		 * 
		 * // add elements left in the first interval while (i <= mid) { temp[k] =
		 * Arr[i]; k += 1; i += 1; }
		 * 
		 * // add elements left in the second interval while (j <= end) { temp[k] =
		 * Arr[j]; k += 1; j += 1; }
		 * 
		 * // copy temp to original interval for (i = start; i <= end; i += 1) { Arr[i]
		 * = temp[i - start]; }
		 */
	}
}
