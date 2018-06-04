package br.com.Aula85_91.ClassesUtilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import javax.swing.SortingFocusTraversalPolicy;

public class Aula91DateFormatELocale {

	public static void main(String[] args) {
		

		
		Date hoje = new Date();
		
		//Locale.setDefault(new Locale("en", "US")); //Usa-se esse m�todo caso queira alterar a formata��o da data de um pa�s para outro.
													// Por exemplo, alterar do Brasil para US ou virse-versa. Tudo abaixo dele ser� formatado de acordo com a linguagem definida.

		System.out.println(hoje); //Mostra a data atual do sistema; 
		
		System.out.println(Locale.getDefault()); //Mostra o c�digo do pa�s;
		
										//O getInstance pega a data completa com dia, m�s, ano e hor�rio;
		String hojeFormatado = DateFormat.getInstance().format(hoje); //Mostra a data formatada de acordo com a localiza��o contida no servidor;
		System.out.println(hojeFormatado);								
		
		//Mostra apenas o hor�rio;
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
	
		//Mostra apenas a data;
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//Mostra a data e a hora;
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//Mostra a hora sem os segundos;
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		//Mostra hora - minutos - segundos;
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		//Mostra hora - minutos - segundos - fuso hor�rio;
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		//Pode utilizar duas formas juntas;
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		//Transformando String em Date;
		String data = "12-02-2018 14:25";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}
}
