package br.com.Aula85_91.ClassesUtilitarias;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90ClasseLocale {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		//Para verificar os locais de internacionalização disponíveis na API;
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale local : locales) {
			System.out.println("Nome: " + local.getDisplayName()); //Mostrar a língua e a localidades dela por extenso;
			System.out.println("Código da Língua: " + local.getLanguage()); //Mostra o código da língua;
			System.out.println("Língua: " + local.getDisplayLanguage()); //Mostra o nome da língua;
			System.out.println("Cod País: " + local.getCountry()); //Mostra o código do país;
			System.out.println("País: " + local.getDisplayCountry()); //Mostra o nome do país;
			
			System.out.println("***********************************//");
			
		}
		
		Locale br = new Locale ("pt, Brasil");
		System.out.println(br);
		
		Locale.setDefault(br);
		System.out.println(Locale.getDefault());
		
		//Formata o número de acordo com a localização informada;
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf1.format(50000000000000d));
			//*Verificar como transformar para REAL;

	}

}
