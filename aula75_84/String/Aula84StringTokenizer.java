package br.com.aula75_84.String;

import java.util.StringTokenizer;

public class Aula84StringTokenizer {

	public static void main(String[] args) {
		
		String doArquivo = "1;Antonio;30";
		
		//String Tokenizer st = new StringTokenizer(str, delim) //Demonstra as Strings separadas por um delimitador definido;
		//O primeiro par�metro refere-se a String de onde ser� extra�da as informa��es e o segundo � o delimitador que ir� separar as Strings;
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		//O delimitador � chamado de Tokens. 
		while (st.hasMoreTokens()) { //Para o Tokenizer � utilizado um while que diz: "Enquanto tiver Token fa�a a a��o.", no caso, separar as Strings; 
			System.out.println(st.nextToken()); //Extrai e pecorre para o pr�ximo Token;
		}

	}

}
