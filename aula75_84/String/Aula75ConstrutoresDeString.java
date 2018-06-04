package br.com.aula75_84.String;

public class Aula75ConstrutoresDeString {

	public static void main(String[] args) {
		
		//Criando String atrav�s do operador new;
		
		String vazia = new String(); // o mesmo que: "", String � um objeto, uma classe logo pode ser criada atrav�s do new;
		System.out.println(vazia); //N�o gera valor;
		
		String java = new String ("JAVA!");
		System.out.println(java);
		
		String java1 = new String(java); //Referenciando outra String;
		System.out.println(java1);
		
		char[] charJava = {'J', 'A', 'V', 'A'};
		String java2 = new String(charJava); //Aceita um array de char;
		System.out.println(java2);
		
		//String abc = new String(value, offset, count);
		char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
		String abc = new String (abcdef, 1,3); //offset, captura apenas os caracteres do indice de inicio at� o indice de fim conforme informados;
		System.out.println(abc);
		
		byte[] ascii = {65, 66, 67, 68};
		String abcde = new String (ascii); //Informa os caracteres correspondentes de acordo com a tabela ascii;
		System.out.println(abcde);
		
		String bcd = new String(ascii, 1,3); //offset, captura apenas os caracteres do indice de inicio at� o indice de fim conforme informados;
		System.out.println(bcd);
		
		String java3 = "JAVA!!";
		String java4 = "JAVA!!";
		System.out.println(java3);
		System.out.println(java4);
				
	}

}
