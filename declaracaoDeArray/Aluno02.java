package br.com.declaracaoDeArray;

public class Aluno02 {

	double[] notas = new double [3];
	
	Aluno02() {
			
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



