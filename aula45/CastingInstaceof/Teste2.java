package br.com.aula45.CastingInstaceof;

public class Teste2 {

	public static void main(String[] args) {
		
		Object obj1 = obterString(); //Object é a Superclasse;
		String s1 = (String) obj1; //String é a Subclasse;
		//Downcasting; Transforma o "obj1" em "s1";
		
		Object obj2 = "Minha String"; //upcasting;
		//O objeto referencia uma String diretamente;
		String s2 = (String) obj2; //downcasting;
		// O objeto obj2(Superclasse) recebe o objeto s2(Subclasse);
		
		//Object obj3 = new Object(); 
		//String s3 = (String) obj3;
		//Dará erro em tempo de execução pois o obj3 não faz referência a uma String.
		//O downcasting funciona apenas se você estiver referenciando aquele tipo em particular.
		
		//Object obj4 = obterinteiro();
		//String s4 = (String) obj4;
		//Não funciona em tempo de execução pois o inteiro não converte em String, nesse caso.
		
	}

	public static String obterString() {
		return "minha String";
		
	}
	
	public static String obterinteiro() {
		return "minha String";
		
	}

}
