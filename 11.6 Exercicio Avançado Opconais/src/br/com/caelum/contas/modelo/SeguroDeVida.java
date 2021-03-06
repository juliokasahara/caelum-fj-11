package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private int numeroApolice;
	//private String titular;
	
	Cliente titular = new Cliente();

	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	@Override
	public Cliente getTitular() {
		return titular;
	}

	@Override
	public String getTipo() {
		return null;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
