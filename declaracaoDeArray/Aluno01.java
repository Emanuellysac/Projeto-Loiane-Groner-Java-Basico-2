package br.com.declaracaoDeArray;

public class Aluno01 {
	
	private double[] notas;

	Aluno01() {
		notas = new double[3];

	}


	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String imprimirNotas() {
		String s = "";
		for (double nota : notas) {
			s += nota + " ";
		}

		return s;
	}

}
