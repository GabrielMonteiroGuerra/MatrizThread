package view;

import controller.MatrizController; //Importando a classe MatrizController
import java.util.Random; //Importando a biblioteca Random

public class Main {

	public static void main(String[] args) {
		int mat [][]= new int [3][5]; //Criando a matriz
		Random random = new Random(); //Método construtor para random 
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; i < 3; i++) {
				mat[i][j] = random.nextInt(100); //Preenchendo a matriz com valores aleatórios
			}
		}
		for(int i = 0; i < 3; i++) { //Mostrando o valor da soma de cada linha da matriz
			MatrizController somaVetor = new MatrizController(i+1, mat[i]); 
			somaVetor.start();
		}

	}

}
