package br.com.aula48.exceptionMultiplosCatch;

public class MultiplosCatch {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) { //System.out.println(numeros[i]); Para mostrar o conteúdo de cada índice.
			
			try {
				
			System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
			
			} catch (ArithmeticException e) {
				
				System.out.println("Erro ao dividir por zero!");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
					//catch ((ArithmeticException | ArrayIndexOutOfBoundsException e)
						//System.out.println("Aconteceu um erro!");
				
				System.out.println("Posição do array inválido!");
				
			}
		}		
	}
}

//java.lang.ArithmeticException //Erro na divisão por zero.
//java.lang.ArrayIndexOutOfBoundsException //Indice da matriz fora do limite.