package controller;

public class MatrizController extends Thread { //Extendendo a classe para Thread
	
	private int linha; //Criando a vari�vel linha
	private int[] vetor = new int[5]; //Criando o vetor de 5 posi��es que ir� armazenar a soma das linhas da matriz
	
	
	public MatrizController(int linha, int[] vetor) { //M�todo "This" para todas as vari�veis
		this.vetor = vetor;
		this.linha = linha;
		
	}
    
	public void run() { //Tudo que estiver dentro do run ser� executado
		int soma = 0;
		for (int i: vetor) { //Percorrer o vetor e ir somando os valores
			soma += i;
		}
		System.out.println("Linha: "+linha+ "\nSoma: "+soma);
	}

	
}
