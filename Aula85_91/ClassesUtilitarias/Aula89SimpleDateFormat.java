package br.com.Aula85_91.ClassesUtilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("y"); //Formata uma data;
		//SimpleDateFormat sdf = new SimpleDateFormat("d/M/y"); //Formata a data com apenas uma casa decimal para o dia e o m�s;
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); //Formata uma data com duas casas decimais para o dia e o m�s;
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyy"); //Formata a data com m�s por extenso;
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy hh:mm:ss a z"); //Verificar na documenta��o todas as poss�veis formas para formatar a data;
		
		  //Podemos utilizar o SimpleDateFormat com a classe Calendar;
		  Calendar data = new GregorianCalendar(2018, 1, 1, 14, 32, 25);
		  System.out.println(sdf.format(data.getTime())); //O getTime retorna uma inst�ncia da classe Data;

		  //Tamb�m podemos utilizar o SimpleDateFormat com a classe Date;
		  Date hoje = new Date();
		  System.out.println(sdf.format(hoje));
		 
		  String d = sdf.format(hoje); //Transforma de um formato Date para um tipo String (n�o em texto);
		  System.out.println(d);
		  
		  //Para transformar uma String em um objeto Date;
		  SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");// Sempre � necess�rio instanciar o SimpleDateFormat para formatar as datas;
		  String minhaData = "30/03/2018 06:11:55 ";
		 
		  try { //O m�todo parse pode levantar uma exce��o;
			Date minhaDataEmDate = sdf1.parse(minhaData); //Transformou a String minhaData em um objeto do tipo Date;
			
			System.out.println(minhaDataEmDate);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		  
		  
	}

}
    