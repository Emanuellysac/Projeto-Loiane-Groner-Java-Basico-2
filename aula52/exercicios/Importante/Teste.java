package br.com.aula52.exercicios.Importante;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();

		int opcao = 1;

		while (opcao != 3) {
			opcao = obterOpcaoMenu(scan); // Chamada ao método;

			if (opcao == 1) { // Consultar contato;
				consultarContato(scan, agenda);
			} else if (opcao == 2) { // Adicionar contato;
				adicionarContato(scan, agenda);
			}
		}
	}

	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacaoString(scan, "Entre com o nome do contato:");
		String telefone = leInformacaoString(scan, "Entre com o telefone do contato:");
		String email = leInformacaoString(scan, "Entre com o email do contato:");

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);

		System.out.println("Contato a ser criado: ");
		System.out.println(contato);

		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());

			System.out.println("Contatos da agenda");
			System.out.println(agenda);

		}
	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = leInformacaoString(scan, "Entre com o nome do contato a ser pesquisado:");
		try {
			if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe!");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String leInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida) { // Enquanto a opção não for válida repete-se o trecho abaixo até que o usuário
									// entre com uma opção válida;
			System.out.println("Digite a opção desejada:");
			System.out.println("1 = Consultar contato");
			System.out.println("2 = Adicionar contato");
			System.out.println("3 = Sair");

			try {
				String entrada = scan.nextLine(); // Recebe a opção digitada pelo usuário em String;
				opcao = Integer.parseInt(entrada); // Transforma String para inteiro;

				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;

				} else {
					throw new Exception("Entrada inválida!"); // Se a opção digitada for diferente de 1, 2 ou 3, será
																// levantada essa exceção;
				}

			} catch (Exception e) { // Para capturar alguma exceção inesperada como por exemplo digitar uma String;
				System.out.println("Entrada inválida, digite novamente!");
			}
		}

		return opcao;
	}
}
