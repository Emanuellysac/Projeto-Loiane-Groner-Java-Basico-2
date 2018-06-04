package br.com.aula51.tiposDeException;

public class TiposDeException {
	
	/*
	
	Throwable - � a super classe de todos os erros e exception.
		Error - vai acontecer em tempo de execu��o e fazer com que o programa termine a sua execu��o.
		Ex: falta de mem�ria para o programa ser executado. Os Erros n�o s�o tratados.
	
		Exception:
			uncheked - n�o verificadas: Acontecem em tempo de execu��o do programa, n�o h� como prever quando ir� ocorrer - RuntimeException.
		
	java.lang.ArithmeticException // Erro na divis�o por zero;
	java.lang.ArrayIndexOutOfBoundsException // Indice da matriz fora do limite;
	java.lang.NullPointException // Ocorre quando se tenta chamar um m�todo de um objeto que ainda n�o foi instanciado; 
	java.lang.ClassCastException // Convers�o de cast entre classes.
	java.util.InputMismatchException // Incompatibilidade de entrada;
			cheked - exception verificadas, o compilador j� reclama e pede para que estas exce��es sejam tratadas.
				
				IOException - ocorre em acesso ou leitura de arquivo;
				SQLException - acesso a banco de dados.
	
	*/

}
