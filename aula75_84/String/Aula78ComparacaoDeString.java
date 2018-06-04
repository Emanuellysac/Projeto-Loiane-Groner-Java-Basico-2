package br.com.aula75_84.String;

public class Aula78ComparacaoDeString {

	public static void main(String[] args) {

		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);
		
		System.out.println("Ola equals ola2 = " + ola.equals(ola2)); //false - compara conteúdo.
		System.out.println("Ola equals ola3 = " + ola.equals(ola3)); //true
		System.out.println("Ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true

		System.out.println("ola == ola2 " + (ola == ola2)); //false - apontam para referências de memória diferentes.
		System.out.println("ola == ola3 " + (ola == ola3)); //true - apontam para a mesma referência de memória.
		/* Quando é realizado atribuição simples de Stirng existe uma espécie de um poll, ou seja,
		um local onde ficam guardadas as Strings feitas com atribuição simples.
		Logo, quando fazemos uma nova atribuição com um valor que já existe, o Java aponta para esta referência existente.
		Quando utilizamos o operador "==" ele vai comparar a referência de memória. */
	
		System.out.println("ola == ola4 " + (ola == ola4)); //false - apontam para referências de memória diferentes.
		System.out.println("ola equals ola4 " + ola.equals(ola4)); //true - compara o conteúdo.
	
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		
		//banana.regionMatches(toffset, other, ooffset, len)
			//a partir de que indice começa a comparar - qual parte será comparada - o primeiro indice da parte a ser comparada - quantidade de caracteres a ser comparado.  
		System.out.println(banana.regionMatches(1, ana, 0, 3)); //true
	
		//compara o final da String; "banana termina com ana?"
		System.out.println(banana.endsWith(ana)); //true
		//compara o inicio da String; "banana começa com ban?"
		System.out.println(banana.startsWith(ban)); //true
		
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		System.out.println(a.compareTo(b)); //-1 quando a > b;
		System.out.println(b.compareTo(a)); //1 ou > 1 quando a < b;
		System.out.println(a.compareTo("a")); //0 quando a == b;
		System.out.println(a.compareTo(aMaiusculo)); //32 referente a diferença na tabela ascii ((a = 97) - (A = 65));
		
		// O compareTo é utilizado quando se trabalha com coleções e se deseja fazer ordenação do array.
		
	}
}
