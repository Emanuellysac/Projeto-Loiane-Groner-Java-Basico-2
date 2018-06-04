package br.com.aula52.criandoExceptions;

public class UsandoMinhaException02 {

	public static void main(String[] args) {
	
	//Trata a exce��o lan�ada pelo m�todo;
		try {
			teste();
		} catch (ExceptionDivisaoNaoExata e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

	
	//Lan�a a exce��o;
	public static void teste() throws ExceptionDivisaoNaoExata {

		int[] numeros = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				if (numeros[i] % 2 != 0) {
					// lan�ar a nova exception;
					throw new ExceptionDivisaoNaoExata(numeros[i], denom[i]);
				}
				
				System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i] / denom[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				e.getMessage();
				e.printStackTrace();

			}
		}
	}
}