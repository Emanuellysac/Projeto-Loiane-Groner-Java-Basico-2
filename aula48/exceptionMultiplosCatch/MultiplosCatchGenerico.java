package br.com.aula48.exceptionMultiplosCatch;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {
	
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) { //System.out.println(numeros[i]); Para mostrar o conteúdo de cada índice.
			
			try {
				
			System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
			
			} catch (ArithmeticException e) {
				
				System.out.println("Erro ao dividir por zero!");
				
			} catch (Throwable e) { //É a super classe de todos os erros e exception;
				
				System.out.println("Ocorreu um erro!");
				
			} 
		}		
	}
}


