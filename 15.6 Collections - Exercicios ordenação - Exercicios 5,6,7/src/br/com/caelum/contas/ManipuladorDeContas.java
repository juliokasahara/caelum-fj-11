package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {

		if (evento.getSelecionadoNoRadio("tipo").equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (evento.getSelecionadoNoRadio("tipo").equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}

		this.conta.setAgencia(evento.getInt("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));

		// System.out.println(this.conta.recuperaDadosParaImpressao());
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposito(valorDigitado);
	}

	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		JOptionPane.showMessageDialog(null, this.conta.transferePara(destino, evento.getDouble("valorTransferencia")));
	}

	public void saca(Evento evento) {
		JOptionPane.showMessageDialog(null, this.conta.saca(evento.getDouble("valorOperacao")));
	}

	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
	}

}
