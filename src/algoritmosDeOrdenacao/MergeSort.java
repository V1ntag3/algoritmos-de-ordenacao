package algoritmosDeOrdenacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MergeSort {
	public MergeSort(String nomeArq, int tamanho) throws FileNotFoundException {
		String nomes[] = new String[tamanho];
		try {
			FileReader arq = new FileReader(nomeArq);
			BufferedReader nomeAtual = new BufferedReader(arq);
			for (int i = 0; i < tamanho; i++) {
				nomes[i] = nomeAtual.readLine();
			}
			nomeAtual.close();
		} catch (Exception e) {
			System.out.println("Erro ao abrir o arquivo!");
		}
		int elementos = 1;
		int inicio, meio, fim;

		while (elementos < tamanho) {
			inicio = 0;

			while (inicio + elementos < tamanho) {

				meio = inicio + elementos;
				fim = inicio + 2 * elementos;

				if (fim > tamanho)
					fim = tamanho;

				intercala(nomes, inicio, meio, fim);

				inicio = fim;
			}

			elementos = elementos * 2;
		}

	}

	private void intercala(String[] vetor, int inicio, int meio, int fim) {
		String novoVetor[] = new String[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;
		while (i < meio && m < fim) {
			if (vetor[i].compareTo(vetor[m]) <= 0) {
				novoVetor[pos] = vetor[i];
				pos = pos + 1;
				i = i + 1;

			} else {

				novoVetor[pos] = vetor[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		while (i < meio) {
			novoVetor[pos] = vetor[i];
			pos = pos + 1;
			i = i + 1;
		}

		while (m < fim) {
			novoVetor[pos] = vetor[m];
			pos = pos + 1;
			m = m + 1;
		}

		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vetor[i] = novoVetor[pos];
		}
	}
}
