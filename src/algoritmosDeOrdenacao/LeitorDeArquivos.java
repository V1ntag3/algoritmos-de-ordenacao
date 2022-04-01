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
		
		//pathFileNames recebe uma string do caminho do local C:/ at� a src
		String pathFileNames = new File("").getAbsolutePath().toString();
		//Declarei um array para armazenar todos os nomes, para, caso precisasse,
		//buscar na lista e n�o ter que ler novamente o arquivo txt.
		
		//um try-catch que lan�a uma excess�o caso ocorra algum problema na leitura
		//� uma boa pr�tica, principalmente na leitura de arquivo.
		try {
			
			FileReader fileNames = new FileReader(pathFileNames + nomeArquivo);
			BufferedReader readFile = new BufferedReader(fileNames);//Aqui readLine recebe o conte�do do arquivo.
			String line = readFile.readLine();//Para come�ar um la�o de repeti��o, linha recebe a primeira linha do arquivo.

			while (line != null ) {//A ultima linha do arquivo retorna null
				arrayEntrada[cont] = Integer.parseInt(line);
				line = readFile.readLine();//Aqui linha recebe a proxima linha do arquivo para continuar a repeti��o
				cont++;
			}
			
			readFile.close();
		} catch (IOException e) {
			System.err.printf("Erro na leitura do arquivo: "+e.getMessage());//Caso tenha algum erro, aqui � executado
		}

		return arrayEntrada;

		
	}
	

}