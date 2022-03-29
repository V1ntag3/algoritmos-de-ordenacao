import java.io.IOException;
import java.util.Scanner;

import algoritmosDeOrdenacao.BubbleSort;
import algoritmosDeOrdenacao.HeapSort;
import algoritmosDeOrdenacao.InsertionSort;
import algoritmosDeOrdenacao.MergeSort;
import algoritmosDeOrdenacao.QuickSort;
import algoritmosDeOrdenacao.StopwatchCPU;
import geradores.GeradorEntrada;
import gerenciadordearquivos.LeitorDeArquivos;

public class Main {
	
	public static String mensagemAlgoritmo = "\n ========= Menu de escolha: Digite um numero correspondente ======="
			+ "\n(1) QuickSort"
			+ "\n(2) MergeSort"
			+ "\n(3) HeapSort"
			+ "\n(4) BubbleSort"
			+ "\n(5) InsertionSort"
			+ "\n =============================================="; 
	public static String mensagemEntradas = "\n ================== Entradas ==========================="
			+ "\n (1) com 100(cem) valores"
			+ "\n (2) com 1000(mil) valores"
			+ "\n (3) com 5000(5 mil) valores"
			+ "\n (4) com 30000(30 mil) valores"
			+ "\n (5) com 50000(50 mil) valores"
			+ "\n (6) com 100000(100 mil) valores"
			+ "\n (7) com 150000(150 mil) valores"
			+ "\n (8) com 200000(200 mil) valores"
			+ "\n =============================================="; 
	public static String mensagemTiposEntradas = "\n ================ Tipo entrada ======================"
			+ "\n (1) Normal - Crescente"
			+ "\n (2) Normal - Decrescente"
			+ "\n (3) Aleat�ria"
			+ "\n =============================================="; 

	public static void main(String[] args) throws IOException {
		LeitorDeArquivos leitor = new LeitorDeArquivos();
		Scanner input = new Scanner(System.in);
		QuickSort quick = new QuickSort(); //Deu certo
		MergeSort merge = new MergeSort(); //Deu errado na execu��o
		HeapSort heap = new HeapSort(); //Deu certo
		BubbleSort bubble = new BubbleSort(); //Deu certo
		InsertionSort insertion = new InsertionSort();		
		Escolhas escolha = new Escolhas();
		
		while(true) {
			
			System.out.println(mensagemAlgoritmo);
			int escolhaAlgoritmo = input.nextInt();
			int escolhaEntrada;
			int escolhaTipo;
			while(escolhaAlgoritmo < 1 || escolhaAlgoritmo > 5) {
				System.out.println("Escolha corretamente: ");
				escolhaAlgoritmo = input.nextInt();
			}
			
			System.out.println(mensagemEntradas);
			escolhaEntrada = input.nextInt();
			while(escolhaEntrada < 1 || escolhaEntrada > 8) {
				System.out.println("Escolha corretamente: ");
				escolhaEntrada = input.nextInt();
			}
			
			System.out.println(mensagemTiposEntradas);
			escolhaTipo = input.nextInt();
			while(escolhaEntrada < 1 || escolhaEntrada > 3) {
				System.out.println("Escolha corretamente: ");
				escolhaTipo = input.nextInt();
			}
			
			int quantidade = escolha.getQuantidade(escolhaEntrada);
			String nomeArquivo = escolha.getNomeArquivo(quantidade, escolhaTipo);
			int array[] = leitor.lerArquivo(quantidade, nomeArquivo);
			double tempoDeExecucao;
			
			if(escolhaAlgoritmo == 1) {
				StopwatchCPU time = new StopwatchCPU();
				quick.sort(array, 0, array.length - 1);
				tempoDeExecucao = time.elapsedTime();
			}else if(escolhaAlgoritmo == 2) {
				StopwatchCPU time = new StopwatchCPU();
				merge.sort(array, 0, array.length - 1);
				tempoDeExecucao = time.elapsedTime();
			}else if(escolhaAlgoritmo == 3) {
				StopwatchCPU time = new StopwatchCPU();
				heap.sort(array);
				tempoDeExecucao = time.elapsedTime();
			}else if(escolhaAlgoritmo == 4) {
				StopwatchCPU time = new StopwatchCPU();
				bubble.sort(array);
				tempoDeExecucao = time.elapsedTime();
			}else {
				StopwatchCPU time = new StopwatchCPU();
				bubble.sort(array);
				tempoDeExecucao = time.elapsedTime();
			}
			
			
			System.out.println("O algoritmo "+escolha.getNameAlgoritmo(escolhaAlgoritmo)+" levou "+ tempoDeExecucao+" segundos para uma entrada de "+ quantidade);
		}
		
	}

}