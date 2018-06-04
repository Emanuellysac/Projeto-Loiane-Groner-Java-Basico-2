package br.com.aula46.interfaceHeranca;

public interface SqlDDL {
	
	void create(String query);
	void drop(String query);
	void alter(String query);

}
