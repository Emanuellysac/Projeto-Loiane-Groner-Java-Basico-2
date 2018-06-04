package br.com.aula49.exceptionsFinally;

public class FinallySystemExit {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) {
			
			try {
				
			System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
				//System.exit(0); Pará a execução do código onde ele estiver, se após um try ou um catch, ao ser encontrado o programa é interrompido; 
			
			} catch (ArithmeticException e) {
				
				System.out.println("Erro ao dividir por zero!");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				//System.exit(0); Pode estar em um try ou em qualquer catch, porém a execução do programa é interrompida no primeiro System.exit(0);
				
				System.out.println("Posição do array inválido!");
				
			}
			
			finally { //O finally sempre será executado após um try ou um catch;
				System.out.println("Esta linha é impressa após o try ou catch");
				System.out.println("");
			}
			
		}									


	}

}
