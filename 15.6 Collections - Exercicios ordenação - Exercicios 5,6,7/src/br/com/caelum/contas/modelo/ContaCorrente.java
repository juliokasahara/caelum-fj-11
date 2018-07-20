package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public String saca(double valor) {
		return super.saca(valor + 0.10) + " Conta Corrente.";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public String getCliente() {
		return this.getCliente();
	}

	@Override
	public String toString() {
		return super.toString() + " - Conta Corrente";
	}

}
