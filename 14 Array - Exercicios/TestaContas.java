package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaContas {
	public static void main(String[] args) {
		Conta[] contasDoBanco = new Conta[10];

		for (int i = 0; i < contasDoBanco.length; i++) {
				Conta conta = new ContaCorrente();
		}
	}
}