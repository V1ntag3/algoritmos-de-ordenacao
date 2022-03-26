import java.io.IOException;

import geradores.GeradorEntrada;
import gerenciadordearquivos.LeitorDeArquivos;

public class Main {

	public static void main(String[] args) throws IOException {
		GeradorEntrada gerador = new GeradorEntrada();
		gerador.gerarEntradaNormal();
		gerador.gerarEntradaAleatoria();		
		System.out.println("Geradas ....");
		
		
		LeitorDeArquivos leitor = new LeitorDeArquivos();
		
		int leitura[] = leitor.lerArquivo(100, "100-A.txt");
		
		int salt = 10;
		for (int i = 0; i < leitura.length; i++) {
			System.out.print(leitura[i]+" - ");
			
			if(i == salt) {
				System.out.println("");
				salt += 10;
			}
		}
	}

}
