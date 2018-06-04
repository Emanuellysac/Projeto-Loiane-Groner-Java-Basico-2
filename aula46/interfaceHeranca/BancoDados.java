package br.com.aula46.interfaceHeranca;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
	
	void abrirConexao();
	void fecharConexao();
	
	
	/* É possível que uma interface extenda outras interfaces, mais de uma ou mesmo tempo.
	Quando se extende(extend) não é obrigado a implementar, na subclasse, os métodos das outras classes herdada(superclasse).
	o extend herda as características mas não obriga implementar os métodos. */

}
