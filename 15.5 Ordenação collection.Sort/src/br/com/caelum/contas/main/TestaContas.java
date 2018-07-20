package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaContas {
	static double total, media;
	
	public static void main(String[] args) {
		
		ContaCorrente test1 = new ContaCorrente("500");
		test1.deposito(500);
		test1.setNumero(1);
		test1.setAgencia(2);
		ContaCorrente test2 = new ContaCorrente("200");
		test2.deposito(200);
		test2.setNumero(2);
		test2.setAgencia(1);
		ContaCorrente test3 = new ContaCorrente("150");
		test3.deposito(150);
		test3.setNumero(1);
		test3.setAgencia(1);
		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(test1);
		contas.add(test2);
		contas.add(test3);
		
		Collections.sort((List<ContaCorrente>) contas);

		for (Conta conta : contas) {
			System.out.println(conta);
		}
		


		List<Conta> contasDoBanco = new ArrayList<>();

		for (int i = 0; i < contasDoBanco.size(); i++) {
			Conta conta = new ContaCorrente("user" + i);
			conta.deposito(i * 100);
			contasDoBanco.add(conta);
		}

		for (Conta conta : contasDoBanco) {
			total += (double) conta.getSaldo();
		}

		media = total / contasDoBanco.size();

		System.out.println(total);
		System.out.println(media);

		System.out.println("\n");
		Banco bradesco = new Banco("Bradesco", 237);

		try {
			Conta c1 = new ContaPoupanca("Julio");
			c1.deposito(500);
			Conta c2 = new ContaCorrente("Ana");
			c2.deposito(200);
			Conta c3 = new ContaCorrente("Carlos");
			c3.deposito(150);
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

			//Collections.sort((List<Conta>) bradesco.getContas());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\nTodos os Clientes:");
		bradesco.mostraContas();

		Conta test = new ContaPoupanca("Julio");
		System.out.println("Cliente ? " + bradesco.contem(test));

	}
}