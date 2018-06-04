package br.com.aula75_84.String;

import java.util.Arrays;

public class Aula77ExtraindoCharsDeString {

	public static void main(String[] args) {
		
		//String � uma sequ�ncia de caracteres;
		
		String java = "Java";
		
		//Demonstra os caracteres do array por �ndice;
		for (int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i)); //Retorna cada char no seu indice espec�fico;
			
		}
		//Demonstra apenas parte da String, conforme par�metro;
		char [] javax = new char[3];
		java.getChars(0, 3, javax, 0); //indice inicial a ser copiado, (at�) indice final(n�o inclusivo), local de destino(nome do array), primeiro indice do array; 
		System.out.println(javax);
		
		//O c�digo anterior tem a mesma fun��o do c�digo abaixo:
		for (int i=0, j=0; i<3; i++, j++) {
			javax[j] = java.charAt(i);
		}
		System.out.println(javax);
		
		//Demonstra os caracteres em formato ascii;
		byte[] javBytes = new byte[3];
		java.getBytes(0, 3,javBytes, 0);
		System.out.println(Arrays.toString(javBytes));
		
		//Transforma a String em um array, ou seja, cada caracter da string ser� direcionada a um �ndice do array.
		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
		

	}

}
