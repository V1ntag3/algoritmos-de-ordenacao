package algoritmosDeOrdenacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class MainGeradorNumeros {
	

	public static void main(String[] args) {

		// instância um objeto da classe Random especificando a semente
		Random gerador = new Random(100);
		FileWriter arq = null;
		try {
			arq = new FileWriter("../numaleatorios.txt");
			BufferedWriter arquivo = new BufferedWriter(arq);
			PrintWriter gravarArq = new PrintWriter(arq);
			// imprime sequência de 10 números inteiros aleatórios entre 0 e 25
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				gravarArq.println(i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
