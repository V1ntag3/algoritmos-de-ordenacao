package algoritmosDeOrdenacao;

import java.io.BufferedReader;
import java.io.FileReader;

public class BubbleSort {
	  public BubbleSort(String nomeArq, int qnt){
			String nomes[] = new String[qnt];
			String aux = new String();
			
			try {
				FileReader arq = new FileReader(nomeArq);
				BufferedReader nomeAtual = new BufferedReader(arq);
				for(int i = 0; i < qnt; i++) {
					nomes[i] = nomeAtual.readLine();
				}
				nomeAtual.close();
			} catch (Exception e) {
				System.out.println("Erro ao abrir o arquivo!");
			}
			
			for(int i = 0; i < qnt; i++){
				for(int j = 0; j < qnt - 1; j++){
					if(nomes[j].compareTo(nomes[j + 1]) > 0){
						aux = nomes[j];
						nomes[j] = nomes[j + 1];
						nomes[j + 1] = aux;
					}
				}
			}	
			
		}
}
