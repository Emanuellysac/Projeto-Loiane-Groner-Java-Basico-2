package br.com.aula75_84.String;

public class Aula80ModificandoString {

	public static void main(String[] args) {
		
		String teste = "Isso é apenas um teste!";
		
		System.out.println(teste);
		//System.out.println(teste.substring(beginIndex)); Mostra a parte da String A PARTIR do indice informado EM DIANTE;
		System.out.println(teste.substring(7)); //Mostrará a parte da String a partir do indice 10 em diante;
		
		//System.out.println(teste.substring(beginIndex, endIndex));
			//Mostra a parte da String a partir de um índice de INICIO até um indice FIM;
		System.out.println(teste.substring(7, 13)); //Mostrará a parte da String a partir do indice 10 até o indice 15. O indice inicio é inclusivo porém o indice fim não;

		String espacos = " i s p a ç o";
		//String semEspacos = espacos.replace(oldChar, newChar)
		String semEspacos = espacos.replace('i', 'e'); //Substitui uma String por outra;
		System.out.println(semEspacos);
		
		//semEspacos = semEspacos.replaceAll(regex, replacement);
		semEspacos = semEspacos.replaceAll(" ", "");//Substitui um caracter por outro em toda a String; 
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim()); //Retira os espaços vazios do inicio e do fim da String;
		
		String ola = "olá ";
		String mundo = "mundo!";
		String olaMundo = ola.concat(mundo); //O mesmo que: ola + mundo;
		System.out.println(olaMundo); //Não se utiliza muito essa forma de concatenação;
	
		
		
	}

}
