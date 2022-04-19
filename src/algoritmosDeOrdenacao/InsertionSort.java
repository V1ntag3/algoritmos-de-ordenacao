package algoritmosDeOrdenacao;

public class InsertionSort {
	public long comparacoes;

	public InsertionSort() {
		this.comparacoes = 0;
	}

	public void sort(int[] A) {
		for (int j = 1; j < A.length; j++) {
			int chave = A[j];
			int i = j - 1;
			this.comparacoes++;
			while (i >= 0 && A[i] > chave) {
				this.comparacoes++;
				A[i + 1] = A[i];
				i = i - 1;
			}
			this.comparacoes++;
			
			A[i + 1] = chave;
		}
		this.comparacoes++;
	}

	public long getComparacoes() {
		return this.comparacoes;
	}
}