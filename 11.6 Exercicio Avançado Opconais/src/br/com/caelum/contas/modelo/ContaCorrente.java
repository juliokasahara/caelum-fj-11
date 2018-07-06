package br.com.caelum.contas.modelo;

public class ContaCorrente implements Conta{

	private double saldo;
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		// TODO Auto-generated method stub
		
	}

		
}
