package br.com.aula45.CastingInstaceof;

public class Teste {

	public static void main(String[] args) {
	
		//Pessoa � a Superclasse, Aluno � a Subclasse.
		
		Aluno aluno1 = new Aluno();
		Pessoa pessoaAluno = aluno1; //aluno1(Subclasse) recebe pessoaAluno(Superclasse); 
		//upcasting - Transforma uma classe menor em uma classe maior.
		
		
		//Pessoa aluno2 = new Aluno();
					//ou
		Pessoa aluno2 = (Pessoa) new Aluno(); //upcasting
		
		//Pessoa aluno3 = new Pessoa(); //Objeto da classe Pessoa(Superclasse);
		//Aluno aluno4 = (Aluno) aluno3; 
		//O objeto aluno3(Superclasse) recebe o objeto aluno4(Subclasse);
		//Dar� erro em tempo de execu��o pois o aluno3 n�o referencia um tipo em particular.
		
		
		//O instanceof verifica se um objeto � uma instancia de uma classe.
		Pessoa pessoa = new Pessoa();
		Aluno aluno5 = new Aluno();
		
		if(aluno5 instanceof Pessoa) {
			System.out.println("Verdade");
		} else {
			System.out.println("Falso");
		}
	}

}
