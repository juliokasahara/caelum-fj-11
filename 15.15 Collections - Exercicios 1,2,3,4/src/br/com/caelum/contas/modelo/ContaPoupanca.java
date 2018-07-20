package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	@Override
	public String getTipo() {
		return "Conta Pupopanša";
	}
	
	@Override
	public String saca(double valor) {
		return super.saca(valor) + " Conta Poupanša.";
	}
	
	@Override
	public String toString() {
		return super.toString() + " Conta Poupanša";
	}
}
