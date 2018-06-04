package br.com.aula47.exceptionsTryCatch;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception!");

			vetor[4] = 1; // A posição 4 não existe.

			System.out.println("Esse texto não será impresso!");

		} catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Exceção ao acessar um índice do vetor que não existe.");
		}

		System.out.println("Esse texto será impresso.");

	}
}

//java.lang.ArithmeticException //Erro na divisão por zero.
//java.lang.ArrayIndexOutOfBoundsException //Indice da matriz fora do limite.
