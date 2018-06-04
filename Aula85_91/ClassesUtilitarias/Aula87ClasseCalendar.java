package br.com.Aula85_91.ClassesUtilitarias;

import java.util.Calendar;

public class Aula87ClasseCalendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); // singleton

		int ano = hoje.get(Calendar.YEAR);

		int mes = hoje.get(Calendar.MONTH);

		int dia = hoje.get(Calendar.DAY_OF_MONTH);

		int hora = hoje.get(Calendar.HOUR_OF_DAY);

		int minutos = hoje.get(Calendar.MINUTE);

		int segundos = hoje.get(Calendar.SECOND);

		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d",

				dia, (mes + 1), ano, hora, minutos, segundos);

		hoje.add(Calendar.DAY_OF_MONTH, -5); //Para subtrair dias;
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
			
		hoje.add(Calendar.DAY_OF_MONTH, 1); //Para somar dias;
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(Calendar.FEBRUARY + " = Fevereiro"); //Mostra o número correspondente ao mês. No Java os meses começam pelo 0 até o 11; 
		

	}

}
