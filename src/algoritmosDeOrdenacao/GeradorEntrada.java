package algoritmosDeOrdenacao;

import java.io.IOException;
import java.util.Random;

//import gerenciadordearquivos.EscritorDeArquivos;

public class GeradorEntrada {
	int[] values = {100, 1000, 5000, 30000, 50000, 100000, 150000, 200000};
	EscritorDeArquivos escritorArquivo = new EscritorDeArquivos();
	
	
	public void gerarEntradaNormal() throws IOException {
		try {
			for (int i = 0; i < values.length; i++) {
				escritorArquivo.escreverArquivo(gerarArray(values[i]), values[i]+"-N.txt");
			}
		} catch (Exception e) {
			throw new IOException(e);
		}
	}
	
	public void gerarEntradaAleatoria() throws IOException {
		try {
			for (int i = 0; i < values.length; i++) {
				escritorArquivo.escreverArquivo(gerarArrayAleatorio(values[i]), values[i]+"-A.txt");
			}
		} catch (Exception e) {
			throw new IOException(e);
		}
	}
	
	public int[] gerarArray(int tamanho) {
		int entrada[] = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			entrada[i] = i+1;
		}
		
		return entrada;
	}
	
	public int[] gerarArrayAleatorio(int tamanho) {
		int entrada[] = new int[tamanho];
		Random gerador = new Random(20220326);
		
		for (int i = 0; i < tamanho; i++) {
			entrada[i] = gerador.nextInt(tamanho+1);
		}
		
		return entrada;
	}
	
	

}