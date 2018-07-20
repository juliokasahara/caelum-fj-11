package br.com.caelum.contas.modelo;

public interface Tributavel {
	
	 double getValorImposto();
	 Cliente getTitular();
	 String getTipo();

}
