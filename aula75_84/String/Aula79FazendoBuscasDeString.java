package br.com.aula75_84.String;

public class Aula79FazendoBuscasDeString {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		
		//"Indice de"; A partir do caracter informado o Java informa o índice onde ele está localizado;
		System.out.println(banana.indexOf('x')); // retorna -1 porque o elemento não existe;
		System.out.println(banana.indexOf('b')); //indice 0;
		System.out.println(banana.indexOf('a')); //indice 1 - caso haja o mesmo caracter mais de uma vez, será mostrado o primeiro indice onde ele aparece;
		System.out.println(banana.indexOf(ana)); //indice 1
		
		//Mostra o último indice onde o caracter aparece, no caso dele existir mais de uma vez;
		System.out.println(banana.lastIndexOf('a')); //indice 5;
		
		//Retorna true ou false se o caracter ou trecho da palavra conter na String;
		System.out.println(banana.contains(ana)); //"ana contém em banana?" - true;
	
	}

}
