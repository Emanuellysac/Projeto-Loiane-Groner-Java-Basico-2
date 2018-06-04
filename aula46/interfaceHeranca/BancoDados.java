package br.com.aula46.interfaceHeranca;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
	
	void abrirConexao();
	void fecharConexao();
	
	
	/* � poss�vel que uma interface extenda outras interfaces, mais de uma ou mesmo tempo.
	Quando se extende(extend) n�o � obrigado a implementar, na subclasse, os m�todos das outras classes herdada(superclasse).
	o extend herda as caracter�sticas mas n�o obriga implementar os m�todos. */

}
