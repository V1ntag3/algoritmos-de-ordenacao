package algoritmosDeOrdenacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainGeradorNumeros {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("/home/");
		try (FileWriter fw = new FileWriter( arquivo, true )) {
			// Gerar os 5 números aleatórios e mostrá-los:
		     for (int i = 0; i < 5; i++) {
		        int numAleatorio = (int)(Math.random() * 10 ) + 1;
		        
		        fw.append(numAleatorio + "");
		        System.out.println("Número: " + numAleatorio);
		     }
		}
		   }

}
