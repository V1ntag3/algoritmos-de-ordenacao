package algoritmosDeOrdenacao;

public class GraficodoInsertionSortTempoEx {

	public static void main(String[] args) 
	{
		Escolhas escolha = new Escolhas();
		LeitorDeArquivos leitor = new LeitorDeArquivos();
		InsertionSort insertion = new InsertionSort();
		String nomeArquivo = escolha.getNomeArquivo(100, 3);
		int array[] = leitor.lerArquivo(100000, nomeArquivo);
		for(int x: array) System.out.println(x);
		double tempoDeExecucao;
		int comparacoes = 0;
		StopwatchCPU time = new StopwatchCPU();
		insertion.sort(array);
		tempoDeExecucao = time.elapsedTime();
		System.out.println(tempoDeExecucao + " segundos");
		

	}

}
