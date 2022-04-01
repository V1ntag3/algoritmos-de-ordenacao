package algoritmosDeOrdenacao;

public class BubbleSort {
	public int comparacoes;

	public BubbleSort() {
		this.comparacoes = 0;
	}

	public void sort(int[] A) {
		int trocar;
		for (int i = 0; i < A.length; i++) {
			this.comparacoes++;
			for (int j = A.length - 1; j > i; j--) {
				this.comparacoes++;
				if (A[j] < A[j - 1]) {
					trocar = A[j];
					A[j] = A[j - 1];
					A[j - 1] = trocar;
				}
			}
		}
	}

	public int getComparacoes() {
		return this.comparacoes;
	}
}
