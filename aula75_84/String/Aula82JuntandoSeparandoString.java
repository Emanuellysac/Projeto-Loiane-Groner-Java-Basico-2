package br.com.aula75_84.String;

public class Aula82JuntandoSeparandoString {

	public static void main(String[] args) {
	
		//String alfabeto = String.join(delimiter, elements); 
		String alfabeto = String.join(", ", "A", "B", "C", "D");//Entre cada caracter ser� colocado uma v�rgula como delimitador para separar cada caracter da String; 
		System.out.println(alfabeto);
		
		//String[] letras = alfabeto.split(regex);
		  String[] letras = alfabeto.split(", "); //Retira o delimitador informado entre os caracteres.
		  for (String letra : letras) {
			  System.out.println(letra);
		
			  //*V� v�deo desta aula.
			
		}
	}

}
