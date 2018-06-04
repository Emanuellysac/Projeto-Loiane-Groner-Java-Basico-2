package br.com.declaracaoDeArray;

public class TesteAluno00 {
	
	public static void main(String[] args) {
		
		//Utilizando o construtor vazio:
		 
		Aluno00 manu = new Aluno00(); //Objeto;
				
		//1- Criar o Array;
		double[] notas1 = new double[3];
		
		//2- Inserir informações em cada índice do Array;
		notas1[0] = 7.5;
		notas1[1] = 8.5;
		notas1[2] = 10.0;
		
		//Vincular o Array ao objeto;
		manu.setNotas(notas1);
		
		
		//***************************************************************//
		
		Aluno00 mano = new Aluno00(); //Objeto;
		
		double[] notas = {3, 2, 1}; //Cria e inicializa o array;
		
		//Vincular o Array ao objeto;
		mano.setNotas(notas);
				
		//***************************************************************//
		
		
		//Utilizando o construtor com parâmetro:
		
		Aluno00 maga = new Aluno00(new double [3]); //Objeto;
			
		//Inicializar o Array;
		double[] notas2 = {1, 2, 3};  	
		
		//Vincular o Array ao objeto;
		maga.setNotas(notas2);
		
		System.out.println(manu.imprimirNotas());
		System.out.println(mano.imprimirNotas());
		System.out.println(maga.imprimirNotas());
			
	}

}
