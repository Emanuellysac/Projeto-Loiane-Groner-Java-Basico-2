package br.com.declaracaoDeArray;

public class Aluno00 {

	//Atributo
	private double[] notas;

	//Construtor vazio
	Aluno00(){
		
	}

	//Construtor com parâmetro
	public Aluno00(double[] notas) {
		this.notas = notas;
	}
	
	//Método get
	public double[] getNotas() {
		return notas;
	}

	//Método set
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	//Método para imprimir
	public String imprimirNotas() {
		String s = "";
		for (double nota : notas) {
			s += nota + " ";
		}

		return s;
	}

}
