package gerenciadordearquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritorDeArquivos {
	
	public void escreverArquivo(int dados[], String arquivo) throws IOException {
		String tipoArquivo = arquivo.split(".txt")[0];
		tipoArquivo = tipoArquivo.split("-")[1];
		String nomeArquivo = "";
		if(tipoArquivo.equals("A")) {
			nomeArquivo = "\\src\\entradas\\aleatoria\\"+arquivo;
		}else {
			nomeArquivo = "\\src\\entradas\\normal\\"+arquivo;
		}
		
		String pathArquivo = new File("").getAbsolutePath().toString();
		
		try {
			FileWriter arquivoBuffer = new FileWriter(pathArquivo + nomeArquivo);
			PrintWriter gravadorDeArquivo = new PrintWriter(arquivoBuffer);
			arquivoBuffer.flush();//Limpa o arquivo antes de escrever
			
			for (int i = 0; i < dados.length; i++) {
				gravadorDeArquivo.println(dados[i]);
			}
			
			arquivoBuffer.close();
			System.out.println("Gravação terminada ...");
			
			
		} catch (Exception e) {
			System.out.println("Erro ao grava no arquivo: "+arquivo+"\n Mensagem: "+ e.getMessage());
		}
	}

}
