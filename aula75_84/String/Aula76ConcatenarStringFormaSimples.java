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
		
		String um = String.valueOf(1); //Transforma n�mero em String;
		System.out.println(um);
		
		String concatenacao = "String s�o imut�veis, " +
							   "ou seja, " + 
							   "seu valor n�o muda.";
		System.out.println(concatenacao);
		
		//Para cada concatenacao da String concatenacao1 � gerado uma nova refer�ncia de mem�ria.
		//A refer�ncia anterior n�o se apaga at� o garba collection verificar a inoperancia das mesmas e fazer a limpeza.
		String concatenacao1 = "String s�o imut�veis, "; //� uma refer�ncia na mem�ria;
		concatenacao1 += "ou seja, "; // quando concatena � gerado outra refer�ncia na mem�ria;
		concatenacao1 += "seu valor n�o muda."; //outra nova refer�ncia na mem�ria � gerada e as anteriora ser�o limpadas pelo garba collector;
		
		
		//"String s�o imut�veis, " 
		
		
	}

}
