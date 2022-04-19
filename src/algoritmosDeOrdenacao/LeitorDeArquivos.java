package algoritmosDeOrdenacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivos {
	
	public int[] lerArquivo(int quantidade, String arquivo) {
		int[] arrayEntrada = new int[quantidade];
		String tipoArquivo = arquivo.split(".txt")[0];
		tipoArquivo = tipoArquivo.split("-")[1];
		int cont = 0; 
		
		String nomeArquivo = "";
		if(tipoArquivo.equals("A")) {
			nomeArquivo = "\\src\\entradas\\aleatoria\\"+arquivo;
		}else if(tipoArquivo.equals("N")) {
			nomeArquivo = "\\src\\entradas\\normal\\"+arquivo;
		}
		else 
		{
			nomeArquivo = "\\src\\entradas\\decrescente\\"+arquivo;
		}
		
		//pathFileNames recebe uma string do caminho do local C:/ até a src
		String pathFileNames = new File("").getAbsolutePath().toString();
		//Declarei um array para armazenar todos os nomes, para, caso precisasse,
		//buscar na lista e não ter que ler novamente o arquivo txt.
		
		//um try-catch que lança uma excessão caso ocorra algum problema na leitura
		//é uma boa prática, principalmente na leitura de arquivo.
		try {
			
			FileReader fileNames = new FileReader(pathFileNames + nomeArquivo);
			BufferedReader readFile = new BufferedReader(fileNames);//Aqui readLine recebe o conteúdo do arquivo.
			String line = readFile.readLine();//Para começar um laço de repetição, linha recebe a primeira linha do arquivo.

			while (line != null ) {//A ultima linha do arquivo retorna null
				arrayEntrada[cont] = Integer.parseInt(line);
				line = readFile.readLine();//Aqui linha recebe a proxima linha do arquivo para continuar a repetição
				cont++;
			}
			
			readFile.close();
		} catch (IOException e) {
			System.err.printf("Erro na leitura do arquivo: "+e.getMessage());//Caso tenha algum erro, aqui é executado
		}

		return arrayEntrada;

		
	}
	

}