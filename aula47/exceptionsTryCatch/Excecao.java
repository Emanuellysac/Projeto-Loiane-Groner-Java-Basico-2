package br.com.aula47.exceptionsTryCatch;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception!");

			vetor[4] = 1; // A posi��o 4 n�o existe.

			System.out.println("Esse texto n�o ser� impresso!");

		} catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe.");
		}

		System.out.println("Esse texto ser� impresso.");

	}
}

//java.lang.ArithmeticException //Erro na divis�o por zero.
//java.lang.ArrayIndexOutOfBoundsException //Indice da matriz fora do limite.
