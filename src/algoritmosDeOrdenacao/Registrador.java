package algoritmosDeOrdenacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Registrador {
	
	public void registrar(String algoritmo, int comparacoes, double tempo, int execucao, int valores, String entrada) throws IOException {
		String pathArquivo = new File("").getAbsolutePath().toString();
		String nomeArquivo = "\\src\\relatorios\\relatorio.txt";
		
		String linhaRelatorio = algoritmo+","+entrada+","+execucao+","+valores+","+tempo+","+comparacoes+"\n";
		
		try {
			FileWriter arquivoBuffer = new FileWriter(pathArquivo + nomeArquivo, true);
			PrintWriter gravadorDeArquivo = new PrintWriter(arquivoBuffer);
			gravadorDeArquivo.print(linhaRelatorio);
			arquivoBuffer.close();
			
			System.out.println("Gravação terminada ...");
			
		} catch (Exception e) {
			System.out.println("Erro ao grava no arquivo: relatorio.txt \n Mensagem: "+ e.getMessage());
		}
	}

}