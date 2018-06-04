package br.com.aula52.criandoExceptions;

public class ExceptionDivisaoNaoExata extends Exception {
	
	private int num;
	private int den;
	
	public ExceptionDivisaoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.den = dem;
	}

	@Override
	public String toString() {
		return "DivisaoNaoExata [num=" + num + ", den=" + den + "]: / não é um inteiro!";
	}
	
	

}
