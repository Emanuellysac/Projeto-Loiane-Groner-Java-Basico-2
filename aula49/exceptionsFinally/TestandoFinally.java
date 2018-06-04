package br.com.aula49.exceptionsFinally;

public class TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) {
			
			try {
				
			System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
			
			} catch (ArithmeticException e) {
				
				System.out.println("Erro ao dividir por zero!");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
					//catch ((ArithmeticException | ArrayIndexOutOfBoundsException e)
						//System.out.println("Aconteceu um erro!");
				
				System.out.println("Posi��o do array inv�lido!");
				
			}
			
			finally { //O finally sempre ser� executado ap�s um try ou um catch;
				System.out.println("Esta linha � impressa ap�s o try ou catch");
				System.out.println("");
			}
			
		}		

	}

}
