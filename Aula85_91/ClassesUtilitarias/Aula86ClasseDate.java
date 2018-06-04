package br.com.Aula85_91.ClassesUtilitarias;

import java.util.Date;

public class Aula86ClasseDate {

	public static void main(String[] args) {
		
		Date hoje = new Date(); //Primeiro deve-se instanciar a classe, criar o objeto;
		
		System.out.println(hoje);
		
		System.out.println("Milisegundos desde 1 jan 1970 " + hoje.getTime()); //Retorna a quantidade de milisegundos desde 1970

		System.out.println(hoje.getDate()); //Metódo depreciado;
	}

}
