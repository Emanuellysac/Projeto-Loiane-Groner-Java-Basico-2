package br.com.aula75_84.String;

public class Aula79FazendoBuscasDeString {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		
		//"Indice de"; A partir do caracter informado o Java informa o �ndice onde ele est� localizado;
		System.out.println(banana.indexOf('x')); // retorna -1 porque o elemento n�o existe;
		System.out.println(banana.indexOf('b')); //indice 0;
		System.out.println(banana.indexOf('a')); //indice 1 - caso haja o mesmo caracter mais de uma vez, ser� mostrado o primeiro indice onde ele aparece;
		System.out.println(banana.indexOf(ana)); //indice 1
		
		//Mostra o �ltimo indice onde o caracter aparece, no caso dele existir mais de uma vez;
		System.out.println(banana.lastIndexOf('a')); //indice 5;
		
		//Retorna true ou false se o caracter ou trecho da palavra conter na String;
		System.out.println(banana.contains(ana)); //"ana cont�m em banana?" - true;
	
	}

}
