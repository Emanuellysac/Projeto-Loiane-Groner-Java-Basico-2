package br.com.declaracaoDeArray;

public class TesteAluno01 {

	public static void main(String[] args) {

		Aluno01 manu = new Aluno01();
		
		double[] notas1 = {5.0, 6.0, 7.0};
		
		manu.setNotas(notas1);
		
		System.out.println(manu.imprimirNotas());
		
		
		Aluno01 maga = new Aluno01();
		
		double[] notas2 = {7.0, 6.0, 5.0};
		
		maga.setNotas(notas2);
		
		System.out.println(maga.imprimirNotas());
		
		
	}
}
