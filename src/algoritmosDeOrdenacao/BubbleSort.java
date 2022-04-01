package algoritmosDeOrdenacao;

public class BubbleSort 
{
	public static void sort(int[] A) {
		int trocar;
		for (int i = 0; i < A.length; i++) {
			for (int j = A.length - 1; j > i; j--) {
				if (A[j] < A[j - 1]) {
					trocar = A[j];
					A[j] = A[j - 1];
					A[j - 1] = trocar;
				}
			}
		}
	}

}
