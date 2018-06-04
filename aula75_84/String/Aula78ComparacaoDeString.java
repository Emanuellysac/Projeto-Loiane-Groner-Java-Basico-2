package br.com.aula75_84.String;

public class Aula78ComparacaoDeString {

	public static void main(String[] args) {

		String ola = "Ol�";
		String ola2 = "OL�";
		String ola3 = "Ol�";
		String ola4 = new String(ola);
		
		System.out.println("Ola equals ola2 = " + ola.equals(ola2)); //false - compara conte�do.
		System.out.println("Ola equals ola3 = " + ola.equals(ola3)); //true
		System.out.println("Ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true

		System.out.println("ola == ola2 " + (ola == ola2)); //false - apontam para refer�ncias de mem�ria diferentes.
		System.out.println("ola == ola3 " + (ola == ola3)); //true - apontam para a mesma refer�ncia de mem�ria.
		/* Quando � realizado atribui��o simples de Stirng existe uma esp�cie de um poll, ou seja,
		um local onde ficam guardadas as Strings feitas com atribui��o simples.
		Logo, quando fazemos uma nova atribui��o com um valor que j� existe, o Java aponta para esta refer�ncia existente.
		Quando utilizamos o operador "==" ele vai comparar a refer�ncia de mem�ria. */
	
		System.out.println("ola == ola4 " + (ola == ola4)); //false - apontam para refer�ncias de mem�ria diferentes.
		System.out.println("ola equals ola4 " + ola.equals(ola4)); //true - compara o conte�do.
	
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		
		//banana.regionMatches(toffset, other, ooffset, len)
			//a partir de que indice come�a a comparar - qual parte ser� comparada - o primeiro indice da parte a ser comparada - quantidade de caracteres a ser comparado.  
		System.out.println(banana.regionMatches(1, ana, 0, 3)); //true
	
		//compara o final da String; "banana termina com ana?"
		System.out.println(banana.endsWith(ana)); //true
		//compara o inicio da String; "banana come�a com ban?"
		System.out.println(banana.startsWith(ban)); //true
		
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		System.out.println(a.compareTo(b)); //-1 quando a > b;
		System.out.println(b.compareTo(a)); //1 ou > 1 quando a < b;
		System.out.println(a.compareTo("a")); //0 quando a == b;
		System.out.println(a.compareTo(aMaiusculo)); //32 referente a diferen�a na tabela ascii ((a = 97) - (A = 65));
		
		// O compareTo � utilizado quando se trabalha com cole��es e se deseja fazer ordena��o do array.
		
	}
}
