package br.com.caelum.contas.controller;

import br.com.caelum.contas.modelo.Funcionario;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
		System.out.println(funcionario.getNome() + " Bonificado no valor de :" + funcionario.getBonificacao());

		// chama classe DAO para inserir na tabela de controle de bonificações

		System.out.println("Inserido no banco com sucesso!");
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
