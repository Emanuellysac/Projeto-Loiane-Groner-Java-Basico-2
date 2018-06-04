package br.com.Aula85_91.ClassesUtilitarias;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90ClasseLocale {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		//Para verificar os locais de internacionaliza��o dispon�veis na API;
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale local : locales) {
			System.out.println("Nome: " + local.getDisplayName()); //Mostrar a l�ngua e a localidades dela por extenso;
			System.out.println("C�digo da L�ngua: " + local.getLanguage()); //Mostra o c�digo da l�ngua;
			System.out.println("L�ngua: " + local.getDisplayLanguage()); //Mostra o nome da l�ngua;
			System.out.println("Cod Pa�s: " + local.getCountry()); //Mostra o c�digo do pa�s;
			System.out.println("Pa�s: " + local.getDisplayCountry()); //Mostra o nome do pa�s;
			
			System.out.println("***********************************//");
			
		}
		
		Locale br = new Locale ("pt, Brasil");
		System.out.println(br);
		
		Locale.setDefault(br);
		System.out.println(Locale.getDefault());
		
		//Formata o n�mero de acordo com a localiza��o informada;
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf1.format(50000000000000d));
			//*Verificar como transformar para REAL;

	}

}
