package algoritmosDeOrdenacao;

public class MergeSort {
	
	public void MergeSort(int[] A, int p, int r){
		if(p<r) {
			int q = p+r/2;
			MergeSort(A,p,q);
			MergeSort(A,q+1,r);
			Merge(A,p,q,r);
		}

	}

	public void Merge(int[] A, int p, int q, int r) {
		Integer infinito = Integer.MAX_VALUE; 
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = null;
		int[] R = null;
		for (int i = 0; i < n1; i++) {
			L[i] = A[p+i-1];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = A[q+j];
		}
		L[n1+1] = infinito;
		R[n2+1] = infinito;
		int i =1;
		int j =1;
		for (int k = p; k <= r; k++) {
			if(L[i]<R[j]) {
				A[k] = L[i];
				i = i+1;
			}
			else {
				A[k] = R[j];
				j = j+1;
			}
		}
		}
}
