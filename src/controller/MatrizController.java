package controller;

public class MatrizController extends Thread { //Extendendo a classe para Thread
	
	private int linha; //Criando a variável linha
	private int[] vetor = new int[5]; //Criando o vetor de 5 posições que irá armazenar a soma das linhas da matriz
	
	
	public MatrizController(int linha, int[] vetor) { //Método "This" para todas as variáveis
		this.vetor = vetor;
		this.linha = linha;
		
	}
    
	public void run() { //Tudo que estiver dentro do run será executado
		int soma = 0;
		for (int i: vetor) { //Percorrer o vetor e ir somando os valores
			soma += i;
		}
		System.out.println("Linha: "+linha+ "\nSoma: "+soma);
	}

	
}
