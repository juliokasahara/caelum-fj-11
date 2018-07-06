package br.com.caelum.contas.main;

import br.com.caelum.contas.controller.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

public class Programa {
	public static void main(String[] args) {

		Conta ContaJulio;
		ContaJulio = new Conta();
		Conta ContaAline = new Conta();

		// contaJulio referencia de um objeto Conta.titular referencia de um
		// objeto Cliente.Set no atributo nome do Cliente
		ContaJulio.titular.setNome("Julio");
		ContaJulio.setSaldo(1000.0);

		ContaAline.titular.setNome("Aline");
		ContaAline.setSaldo(500);

		if (ContaJulio.Sacar(200)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente");
		}

		ContaJulio.Deposito(-10500);
		System.out.println(ContaJulio.titular.getNome() + " saldo: " + ContaJulio.getSaldo());
		System.out.println(ContaAline.titular.getNome() + " saldo: " + ContaAline.getSaldo());

		if (ContaJulio.TransferePara(ContaAline, 200)) {
			System.out.println("Transferencia efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente");
		}

		System.out.println(ContaJulio.titular.getNome() + " saldo: " + ContaJulio.getSaldo());
		System.out.println(ContaAline.titular.getNome() + " saldo: " + ContaAline.getSaldo());
		System.out.println("Quantidade de conta:" + Conta.getTotalDeContas());

		System.out.println("--------------------Heran�a---------------------");

		Gerente anaGerente = new Gerente();
		Funcionario anaFuncionaria = new Funcionario();

		anaGerente.setNome("Ana");
		anaGerente.setSenha(123456);
		anaGerente.setSalario(5000);

		anaFuncionaria.setNome("Ana");
		anaFuncionaria.setSalario(5000);

		System.out.println(anaGerente.getNome() + " gerente salario:" + anaGerente.getSalario());
		System.out.println(
				anaGerente.getNome() + " Bonifica��o da classe objeto Gerente salario:" + anaGerente.getBonificacao());

		System.out.println(anaFuncionaria.getNome() + " funcionario salario:" + anaFuncionaria.getSalario());
		System.out.println(anaFuncionaria.getNome() + " Bonifica��o da classe objeto Funcionario salario:"
				+ anaFuncionaria.getBonificacao());

		System.out.println("--------------------Polimorfismo---------------------");

		Gerente gerente = new Gerente();
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000.0);
		System.out.println("Variavel funcionario com tipo de objeto gerente:" + funcionario.getBonificacao());

		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Gerente funcionarioTipoGerente = new Gerente();
		funcionarioTipoGerente.setSalario(5000);
		funcionarioTipoGerente.setNome("Ana Gerente");
		controle.registra(funcionarioTipoGerente);

		Funcionario funcionarioTipoFuncionario = new Funcionario();
		funcionarioTipoFuncionario.setNome("Paulo Funcionario");
		funcionarioTipoFuncionario.setSalario(5000);
		controle.registra(funcionarioTipoFuncionario);

		System.out.println("Total de bonifica��es:" + controle.getTotalDeBonificacoes());

	}
}