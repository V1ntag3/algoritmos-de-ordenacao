package algoritmosDeOrdenacao;

public class InsertionSort {
	public int comparacoes;

	public InsertionSort() {
		this.comparacoes = 0;
	}

	public void sort(int[] A) {
		for (int j = 1; j < A.length; j++) {
			int chave = A[j];
			int i = j - 1;
			while (i >= 0 && A[i] > chave) {
				this.comparacoes++;
				A[i + 1] = A[i];
				i = i - 1;
			}
			A[i + 1] = chave;
		}
	}

	public int getComparacoes() {
		return this.comparacoes;
	}
}