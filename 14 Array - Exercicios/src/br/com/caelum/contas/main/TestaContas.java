package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaContas {

	static double total, media;

	public static void main(String[] args) {

		Conta[] contasDoBanco = new Conta[10];

		for (int i = 0; i < 10; i++) {
			Conta conta = new ContaCorrente("user" + i);
			conta.deposito(i * 100);
			contasDoBanco[i] = conta;
		}

		for (Conta conta : contasDoBanco) {
			total += (double) conta.getSaldo();
		}

		media = total / contasDoBanco.length;

		System.out.println(total);
		System.out.println(media);

		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String[] palavras = frase.split(" ");
		System.out.println(palavras.length);

		for (int i = palavras.length - 1; -1 < i; i--) {
			System.out.print(palavras[i] + " ");
		}

		System.out.println("\n");
		Banco bradesco = new Banco("Bradesco", 237);

		try {
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

			bradesco.adiciona(c1);
			bradesco.adiciona(c2);
			bradesco.adiciona(c3);
			bradesco.adiciona(c4);
			bradesco.adiciona(c5);
			bradesco.adiciona(c6);
			bradesco.adiciona(c7);
			bradesco.adiciona(c8);
			bradesco.adiciona(c9);
			bradesco.adiciona(c10);
			bradesco.adiciona(c11);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\nTodos os Clientes:");
		bradesco.mostraContas();
		
		Conta test = new ContaPoupanca("Julio");
		System.out.println("Cliente ? " + bradesco.contem(test));
		
	}
}