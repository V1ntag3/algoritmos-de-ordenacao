package algoritmosDeOrdenacao;

import java.util.Vector;

public class InsertionSort {
	public InsertionSort(Vector A) {
		for (int i = 1; i < A.size(); i++) {
			int chave = A.get(i);
			int j = i-1;
			while(i>0 & A.get(j)> chave) {
				A.= A.get(i);
				
			}
		}
	}
}
