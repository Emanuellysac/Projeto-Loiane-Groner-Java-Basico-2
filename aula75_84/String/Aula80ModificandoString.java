package br.com.aula75_84.String;

public class Aula80ModificandoString {

	public static void main(String[] args) {
		
		String teste = "Isso � apenas um teste!";
		
		System.out.println(teste);
		//System.out.println(teste.substring(beginIndex)); Mostra a parte da String A PARTIR do indice informado EM DIANTE;
		System.out.println(teste.substring(7)); //Mostrar� a parte da String a partir do indice 10 em diante;
		
		//System.out.println(teste.substring(beginIndex, endIndex));
			//Mostra a parte da String a partir de um �ndice de INICIO at� um indice FIM;
		System.out.println(teste.substring(7, 13)); //Mostrar� a parte da String a partir do indice 10 at� o indice 15. O indice inicio � inclusivo por�m o indice fim n�o;

		String espacos = " i s p a � o";
		//String semEspacos = espacos.replace(oldChar, newChar)
		String semEspacos = espacos.replace('i', 'e'); //Substitui uma String por outra;
		System.out.println(semEspacos);
		
		//semEspacos = semEspacos.replaceAll(regex, replacement);
		semEspacos = semEspacos.replaceAll(" ", "");//Substitui um caracter por outro em toda a String; 
		System.out.println(semEspacos);
		
		String nome = " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim()); //Retira os espa�os vazios do inicio e do fim da String;
		
		String ola = "ol� ";
		String mundo = "mundo!";
		String olaMundo = ola.concat(mundo); //O mesmo que: ola + mundo;
		System.out.println(olaMundo); //N�o se utiliza muito essa forma de concatena��o;
	
		
		
	}

}
