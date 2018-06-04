package br.com.aula52.exercicios.Importante;

import java.util.Iterator;

public class Agenda {
	
	private Contato[] contatos; //Array do objeto Contato;
	
	public Agenda() {
		contatos = new Contato[5]; //Inicialização do array;
		
	}
											//throws  - significa que está exceção não será tratada aqui, ela será lançada e tratada por quem chamar o método.
	public void adicionarContato (Contato c) throws AgendaCheiaException { //Método para adicionar um contato;
		
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) { //Para verificar a posição vazia no array para adicionar o novo contato;
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if (cheia) { //Se a agenda estiver cheia será lançada uma exceção;
			throw new AgendaCheiaException();
		}
	}
													//throws - significa que a exceção será lançada e tratada por quem chamar o método.
	public int consultarContatoPorNome (String nome) throws ContatoNaoExisteException {//Para verificar se o contato já existe;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) { //Informa se o array está cheio ou vazio.
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {; //Compara os nomes;
					return i; //Retorna a posição do contato no caso dele existir;
			}	
		}
	}
		
		throw new ContatoNaoExisteException(nome); //Caso na consulta seja verificado que o contato não existe será levantado essa exceção.	
}

	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			if (c != null) {
				s += c.toString() + "\n";			
			}	
		}	
		return s;
	}
}
