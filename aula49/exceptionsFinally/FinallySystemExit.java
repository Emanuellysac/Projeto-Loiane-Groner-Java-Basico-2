package br.com.aula49.exceptionsFinally;

public class FinallySystemExit {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) {
			
			try {
				
			System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
				//System.exit(0); Par� a execu��o do c�digo onde ele estiver, se ap�s um try ou um catch, ao ser encontrado o programa � interrompido; 
			
			} catch (ArithmeticException e) {
				
				System.out.println("Erro ao dividir por zero!");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				//System.exit(0); Pode estar em um try ou em qualquer catch, por�m a execu��o do programa � interrompida no primeiro System.exit(0);
				
				System.out.println("Posi��o do array inv�lido!");
				
			}
			
			finally { //O finally sempre ser� executado ap�s um try ou um catch;
				System.out.println("Esta linha � impressa ap�s o try ou catch");
				System.out.println("");
			}
			
		}									


	}

}
