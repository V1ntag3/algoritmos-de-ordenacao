package algoritmosDeOrdenacao;

public class Main {

	public static void main(String[] args) {
		int[] A = {8,1,9,2,6,4};
		QuickSort.sort(A,0,A.length-1);
		for (int i : A) {
			System.out.println(i);
		}
		

	}

}
