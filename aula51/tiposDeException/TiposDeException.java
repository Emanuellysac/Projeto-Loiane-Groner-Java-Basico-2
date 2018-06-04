package br.com.aula51.tiposDeException;

public class TiposDeException {
	
	/*
	
	Throwable - é a super classe de todos os erros e exception.
		Error - vai acontecer em tempo de execução e fazer com que o programa termine a sua execução.
		Ex: falta de memória para o programa ser executado. Os Erros não são tratados.
	
		Exception:
			uncheked - não verificadas: Acontecem em tempo de execução do programa, não há como prever quando irá ocorrer - RuntimeException.
		
	java.lang.ArithmeticException // Erro na divisão por zero;
	java.lang.ArrayIndexOutOfBoundsException // Indice da matriz fora do limite;
	java.lang.NullPointException // Ocorre quando se tenta chamar um método de um objeto que ainda não foi instanciado; 
	java.lang.ClassCastException // Conversão de cast entre classes.
	java.util.InputMismatchException // Incompatibilidade de entrada;
			cheked - exception verificadas, o compilador já reclama e pede para que estas exceções sejam tratadas.
				
				IOException - ocorre em acesso ou leitura de arquivo;
				SQLException - acesso a banco de dados.
	
	*/

}
