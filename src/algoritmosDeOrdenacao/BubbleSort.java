package algoritmosDeOrdenacao;

public class BubbleSort {
	int trocar;

	public BubbleSort(int[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = A.length; j < i + 1; j++) {
				if (A[j] < A[j + 1]) {
					trocar = A[j];
					A[j] = A[j - 1];
					A[j - 1] = A[j];
				}
			}
		}
	}
}
