package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome) {
		super(nome);
	}

	@Override
	public String getTipo() {
		return "Conta Pupopan�a";
	}
	
	@Override
	public String saca(double valor) {
		return super.saca(valor) + " Conta Poupan�a.";
	}
	
	@Override
	public String toString() {
		return super.toString() + " Conta Poupan�a";
	}
}
