package br.com.aula45.CastingInstaceof;

public class Aluno extends Pessoa {
	
	private String curso;
	private String[] notas;
	
	public Aluno() {
		super(); 
	}

	public Aluno(String nome, String endereco, String telefone, String curso, String[] notas) {
		super(nome, endereco, telefone); //Faz referência ao construtor da SuperClasse(Pessoa). Sempre que for fazer acesso a SuperClasse é necessário utilizar o Super.
		this.curso = curso; //O "this" faz referência ao construtor da própria classe.
		this.notas = notas;
		
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
		this.notas = notas;
	}
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
		s += super.getEndereco();
		
		return s;
		
	} 
}
