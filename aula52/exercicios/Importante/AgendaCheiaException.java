package br.com.aula52.exercicios.Importante;

public class AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia.";
	}

}
