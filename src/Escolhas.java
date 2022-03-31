import java.util.HashMap;
import java.util.Map;

public class Escolhas {
	Map<Integer, Integer> entradasMap = new HashMap<Integer, Integer>();
	Map<Integer, String> algoritmosMap = new HashMap<Integer, String>();
	Map<Integer, String> tipos = new HashMap<Integer, String>();
	
	Escolhas(){
		this.entradasMap.put(1, 100);
		this.entradasMap.put(2, 1000);
		this.entradasMap.put(3, 5000);
		this.entradasMap.put(4, 30000);
		this.entradasMap.put(5, 50000);
		this.entradasMap.put(6, 100000);
		this.entradasMap.put(7, 150000);
		this.entradasMap.put(8, 200000);
		
		this.algoritmosMap.put(1, "QuickSort");
		this.algoritmosMap.put(2, "MergeSort");
		this.algoritmosMap.put(3, "HeapSort");
		this.algoritmosMap.put(4, "BubbleSort");
		this.algoritmosMap.put(5, "InsertionSort");
		
		this.tipos.put(1, "crescente");
		this.tipos.put(2, "decrescente");
		this.tipos.put(3, "aleatoria");
	}
	
	
	public int getQuantidade(int key) {
		return this.entradasMap.get(key);
	}
	
	public String getNomeArquivo(int quantidade, int tipo) {
		if(tipo == 3) {
			return quantidade+"-A.txt";
		}
		
		return quantidade+"-N.txt";
	}
	
	public String getNameAlgoritmo(int key) {
		return this.algoritmosMap.get(key);
	}
	
	public String getTipo(int tipo) {
		return this.tipos.get(tipo);
	}

}
