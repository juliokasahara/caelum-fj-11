package br.com.caelum.contas.modelo;

import br.com.caelum.javafx.api.util.Evento;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private int numeroApolice;
	private SeguroDeVida seguroDeVida;
	
	Cliente titular = new Cliente();
	
	public void criaSeguro(Evento evento){
		this.seguroDeVida = new SeguroDeVida();
		this.seguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));
		this.seguroDeVida.setValor(evento.getDouble("valor"));
		this.seguroDeVida.titular.setNome(evento.getString("titular"));
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
		return "Seguro de Vida";
	}
}
