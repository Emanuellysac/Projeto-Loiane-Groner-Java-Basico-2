package br.com.aula75_84.String;

import java.util.StringTokenizer;

public class Aula84StringTokenizer {

	public static void main(String[] args) {
		
		String doArquivo = "1;Antonio;30";
		
		//String Tokenizer st = new StringTokenizer(str, delim) //Demonstra as Strings separadas por um delimitador definido;
		//O primeiro parâmetro refere-se a String de onde será extraída as informações e o segundo é o delimitador que irá separar as Strings;
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		//O delimitador é chamado de Tokens. 
		while (st.hasMoreTokens()) { //Para o Tokenizer é utilizado um while que diz: "Enquanto tiver Token faça a ação.", no caso, separar as Strings; 
			System.out.println(st.nextToken()); //Extrai e pecorre para o próximo Token;
		}

	}

}
