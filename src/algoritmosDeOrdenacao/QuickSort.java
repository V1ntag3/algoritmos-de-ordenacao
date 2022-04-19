package algoritmosDeOrdenacao;

public class QuickSort {
	public int comparacoes;

	public QuickSort() {
		this.comparacoes = 0;
	}

	public void sort(int A[], int p, int u) {
		int i = p;
		int j = u;
		int q = (p + u) / 2;
		int x = A[q];
		int trocar;
		while (i <= j) {
			this.comparacoes++;
			while (A[i] < x) {
				i++;
				this.comparacoes++;
			}
			this.comparacoes++;
			while (A[j] > x) {
				j--;
				this.comparacoes++;
			}
			this.comparacoes++;
			this.comparacoes++;
			
			if (i <= j) {
				trocar = A[i];
				A[i] = A[j];
				A[j] = trocar;
				i++;
				j--;
			}
		}
		this.comparacoes++;
		this.comparacoes++;
		this.comparacoes++;
		if (p < j) {
			sort(A, p, j);
		}
		if (u > i) {
			sort(A, i, u);
		}
	}

	/*
	 * public void sort(int A[], int p, int r) { if (p < r) { int q = partition(A,
	 * p, r); sort(A, p, q - 1); sort(A, q + 1, r); } }
	 * 
	 * public int partition(int A[], int p, int r) { int troca; int x = A[p]; int i
	 * = p; for (int j = p + 1; j <= r; j++) { this.comparacoes++; if (A[j] <= x) {
	 * 
	 * i = i + 1; troca = A[i]; A[i] = A[j]; A[j] = troca; } } troca = A[p]; A[p] =
	 * A[i]; A[i] = troca; return i; }
	 */
	public int getComparacoes() {
		return this.comparacoes;
	}

}