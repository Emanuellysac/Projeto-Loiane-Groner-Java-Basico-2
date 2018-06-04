package br.com.declaracaoDeArray;

public class TesteAluno02 {

	public static void main(String[] args) {

		Aluno02 manu = new Aluno02();

		double[] notas1 = {9.0, 9.0, 9.0};
		
		manu.setNotas(notas1);
		
		System.out.println(manu.imprimirNotas());
		
		
		Aluno02 maga = new Aluno02();

		double[] notas2 = {8.0, 8.0, 8.0};
		
		maga.setNotas(notas2);
		
		System.out.println(manu.imprimirNotas());
		
	}
}
