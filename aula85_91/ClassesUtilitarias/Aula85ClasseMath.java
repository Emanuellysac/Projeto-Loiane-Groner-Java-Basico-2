package br.com.Aula85_91.ClassesUtilitarias;

public class Aula85ClasseMath {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3)); //Dois elevado a três;
		
		System.out.println(Math.round(4.7)); //Arredondamento; Acima de 4,5 arredonda para cima;
		System.out.println(Math.round(4.4)); //Abaixo de 4,5 arredonda para baixo;
		
		System.out.println(Math.ceil(4.7)); //Sempre arredonda para cima;
		System.out.println(Math.ceil(4.4));
		
		System.out.println(Math.floor(4.7)); //Sempre arredonda para baixo;
		System.out.println(Math.floor(4.4));
		
		System.out.println(Math.random()); //Gera números aleatórios;
		System.out.println(Math.round(Math.random())); //Gera o número 0 ou 10;
		System.out.println(Math.round(Math.random() * 10)); //Gera um número de 0 a 10;
		
		System.out.println(Math.sin(Math.toRadians(30))); //Calcula o seno;
		System.out.println(Math.cos(Math.toRadians(1))); //Calcula o coseno;
		System.out.println(Math.tan(Math.toRadians(45))); //Calcula a tangente;
	
	
	}
}
