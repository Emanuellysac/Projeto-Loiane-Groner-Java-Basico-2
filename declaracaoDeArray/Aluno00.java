package br.com.declaracaoDeArray;

public class Aluno00 {

	//Atributo
	private double[] notas;

	//Construtor vazio
	Aluno00(){
		
	}

	//Construtor com par�metro
	public Aluno00(double[] notas) {
		this.notas = notas;
	}
	
	//M�todo get
	public double[] getNotas() {
		return notas;
	}

	//M�todo set
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	//M�todo para imprimir
	public String imprimirNotas() {
		String s = "";
		for (double nota : notas) {
			s += nota + " ";
		}

		return s;
	}

}
