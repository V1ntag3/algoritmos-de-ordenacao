package algoritmosDeOrdenacao;

public class Main {

	public static void main(String[] args) {
		int[] A = { 8, 1, 9, 2, 6, 4 };
		// HeapSort.sort(A);
		//MergeSort.sort(A, 0, A.length - 1);
		// InsertionSort.sort(A);
		// BubbleSort.sort(A);
		 QuickSort.sort(A,0,A.length-1);
		for (int i : A) {
			System.out.println(i);
		}

	}

}
