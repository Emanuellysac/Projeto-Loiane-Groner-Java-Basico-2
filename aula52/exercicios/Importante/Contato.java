package br.com.aula52.exercicios.Importante;

public class Contato {
	
	private static int contador = 0; //Sempre que a classe for instanciada será acrescentado mais um no contador.
	private int id;
	private String nome;
	private String telefone;
	private String email;

	public Contato() {
		contador++;
		id = contador; //O id recebe o contador;
	}

	public int getId() {
		return id;
	}

	//public void setId(int id) { O id será controlado internamente, não deverá ser setado por quem estiver utilizando a classe.
		//this.id = id;
	//}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s= "[";
		s +="id: " + id;
		s +=", Nome: " + nome;
		s +=", Telefone: " + telefone;
		s +=", Email: " + email;
		s +="]";
		
		return s;
	}
	
	
}
