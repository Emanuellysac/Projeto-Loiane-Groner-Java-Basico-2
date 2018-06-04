package br.com.aula75_84.String;

import java.util.Arrays;

public class Aula77ExtraindoCharsDeString {

	public static void main(String[] args) {
		
		//String é uma sequência de caracteres;
		
		String java = "Java";
		
		//Demonstra os caracteres do array por índice;
		for (int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i)); //Retorna cada char no seu indice específico;
			
		}
		//Demonstra apenas parte da String, conforme parâmetro;
		char [] javax = new char[3];
		java.getChars(0, 3, javax, 0); //indice inicial a ser copiado, (até) indice final(não inclusivo), local de destino(nome do array), primeiro indice do array; 
		System.out.println(javax);
		
		//O código anterior tem a mesma função do código abaixo:
		for (int i=0, j=0; i<3; i++, j++) {
			javax[j] = java.charAt(i);
		}
		System.out.println(javax);
		
		//Demonstra os caracteres em formato ascii;
		byte[] javBytes = new byte[3];
		java.getBytes(0, 3,javBytes, 0);
		System.out.println(Arrays.toString(javBytes));
		
		//Transforma a String em um array, ou seja, cada caracter da string será direcionada a um índice do array.
		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
		

	}

}
