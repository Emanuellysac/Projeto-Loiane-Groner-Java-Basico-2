package br.com.aula46.interfaceHeranca;

public class BancoMySQL implements BancoDados {
	
	/* Quando a classe implementa uma interface � obrigat�rio que ela implemente todos m�todos da interface.
	Nesse caso BancoDados � uma interface que extende outras interfaces, logo, quando BancoMySQL implementa BancoDados,
	todos os m�todos de todas as interfaces ligadas a BancoDados s�o implementados em BancoMySQL. */ 

	/* Classe s� pode extender uma outra classe e pode implementar quantas outras classes sejam necess�rio.
	 As interfaces podem extender quantas interfaces forem necess�rias.
	 */
	
	@Override
	public void grand(String access) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revoke(String access) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drop(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alter(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrirConexao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fecharConexao() {
		// TODO Auto-generated method stub
		
	}

}
