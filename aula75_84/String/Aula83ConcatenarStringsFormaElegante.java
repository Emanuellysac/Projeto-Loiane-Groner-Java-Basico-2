package br.com.aula75_84.String;

public class Aula83ConcatenarStringsFormaElegante {

	public static void main(String[] args) {
		
		
		String [] letras = {"A ", "B ", "C ", "D ", "E ", "F "};
		String alfabeto = "";
		
		/* Forma simples:
		for (String letra : letras) {
			alfabeto +=letra;
		}
		System.out.println(alfabeto); */
		
		StringBuffer sb = new StringBuffer(); //StringBuffer - É Threads Safe - utilizado no caso de mais de uma thread;
		for (String letra : letras) {
			sb.append(letra);//Faz o "append" para todas as Strings que serão adicionadas na "super" String ou String única;
		}
		alfabeto = sb.toString();
		System.out.println(alfabeto);
			//ou:
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse()); //Imprimi a String de forma contrária;
		
		//
		StringBuilder sb_ = new StringBuilder(); //Não é Threads Safe;
		for (String letra : letras) {
			sb.append(letra);
		}
		alfabeto = sb_.toString();
		

	}

}
