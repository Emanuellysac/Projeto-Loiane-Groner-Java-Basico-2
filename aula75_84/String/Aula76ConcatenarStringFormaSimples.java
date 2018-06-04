package br.com.aula75_84.String;

public class Aula76ConcatenarStringFormaSimples {

	public static void main(String[] args) {
		
		String curso = "Curso ";
		String java = "java!";
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		
		String resultado2mais2 = "Resultado 2+2 = " + (2+2);
		System.out.println(resultado2mais2);
		
		String resultado2Com2 = "Resultado 2+2 = " + 2 + 2;
		System.out.println(resultado2Com2);
		
		String um = String.valueOf(1); //Transforma número em String;
		System.out.println(um);
		
		String concatenacao = "String são imutáveis, " +
							   "ou seja, " + 
							   "seu valor não muda.";
		System.out.println(concatenacao);
		
		//Para cada concatenacao da String concatenacao1 é gerado uma nova referência de memória.
		//A referência anterior não se apaga até o garba collection verificar a inoperancia das mesmas e fazer a limpeza.
		String concatenacao1 = "String são imutáveis, "; //é uma referência na memória;
		concatenacao1 += "ou seja, "; // quando concatena é gerado outra referência na memória;
		concatenacao1 += "seu valor não muda."; //outra nova referência na memória é gerada e as anteriora serão limpadas pelo garba collector;
		
		
		//"String são imutáveis, " 
		
		
	}

}
