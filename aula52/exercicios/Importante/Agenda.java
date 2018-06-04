package br.com.aula52.exercicios.Importante;

import java.util.Iterator;

public class Agenda {
	
	private Contato[] contatos; //Array do objeto Contato;
	
	public Agenda() {
		contatos = new Contato[5]; //Inicializa��o do array;
		
	}
											//throws  - significa que est� exce��o n�o ser� tratada aqui, ela ser� lan�ada e tratada por quem chamar o m�todo.
	public void adicionarContato (Contato c) throws AgendaCheiaException { //M�todo para adicionar um contato;
		
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) { //Para verificar a posi��o vazia no array para adicionar o novo contato;
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if (cheia) { //Se a agenda estiver cheia ser� lan�ada uma exce��o;
			throw new AgendaCheiaException();
		}
	}
													//throws - significa que a exce��o ser� lan�ada e tratada por quem chamar o m�todo.
	public int consultarContatoPorNome (String nome) throws ContatoNaoExisteException {//Para verificar se o contato j� existe;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) { //Informa se o array est� cheio ou vazio.
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {; //Compara os nomes;
					return i; //Retorna a posi��o do contato no caso dele existir;
			}	
		}
	}
		
		throw new ContatoNaoExisteException(nome); //Caso na consulta seja verificado que o contato n�o existe ser� levantado essa exce��o.	
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
