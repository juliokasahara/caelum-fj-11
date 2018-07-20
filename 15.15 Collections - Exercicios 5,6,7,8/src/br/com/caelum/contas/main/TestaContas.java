package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaContas {

	static double total, media;

	public static void main(String[] args) {

		Banco bradesco = new Banco("Bradesco", 237);
		
		Conta c1 = new ContaPoupanca("Julio");
		Conta c2 = new ContaCorrente("Ana");
		Conta c3 = new ContaCorrente("Carlos");
		Conta c4 = new ContaPoupanca("Julia");
		Conta c5 = new ContaCorrente("Renata");
		Conta c6 = new ContaCorrente("Roberto");
		Conta c7 = new ContaPoupanca("João");
		Conta c8 = new ContaCorrente("Thiago");
		Conta c9 = new ContaPoupanca("Henrique");
		Conta c10 = new ContaCorrente("Katia");
		Conta c11 = new ContaCorrente("Anderson");

		try {

			System.out.println(bradesco.adiciona(c1));
			System.out.println(bradesco.adiciona(c2));
			System.out.println(bradesco.adiciona(c3));
			System.out.println(bradesco.adiciona(c4));
			System.out.println(bradesco.adiciona(c5));
			System.out.println(bradesco.adiciona(c6));
			System.out.println(bradesco.adiciona(c7));
			System.out.println(bradesco.adiciona(c8));
			System.out.println(bradesco.adiciona(c9));
			System.out.println(bradesco.adiciona(c10));
			System.out.println(bradesco.adiciona(c11));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// System.out.println("\nTodos os Clientes:");
		// bradesco.mostraContas();

		// Conta test = new ContaPoupanca("Julio");
		// System.out.println("Cliente ? " + bradesco.contem(test));
		
		
		System.out.println("\n");
		System.out.println("Conta pega(int x) ->" + bradesco.pega(3));
		System.out.println("pegaQuantidadeDeContas() ->" + bradesco.pegaQuantidadeDeContas());
		System.out.println("Conta buscaPorTitular(String nome) ->" + bradesco.buscaPorTitular("João"));

		System.out.println("\n\n");
		System.out.println("--------HashSet--------");
		Banco itau = new Banco("itau", 251, true);

		
		System.out.println(itau.adiciona(c1));
		System.out.println(itau.adiciona(c2));
		System.out.println(itau.adiciona(c3));
		System.out.println(itau.adiciona(c4));
		System.out.println(itau.adiciona(c5));
		System.out.println(itau.adiciona(c6));
		System.out.println(itau.adiciona(c7));
		System.out.println(itau.adiciona(c8));
		System.out.println(itau.adiciona(c9));
		System.out.println(itau.adiciona(c10));
		System.out.println(itau.adiciona(c11));
		
		System.out.println(itau.getContas());

	}
}