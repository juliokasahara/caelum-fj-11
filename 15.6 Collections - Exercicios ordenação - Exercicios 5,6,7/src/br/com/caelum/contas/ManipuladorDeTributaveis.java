package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {

	private double total;

	public void calculaImpostos(Evento e) {
		total = 0;
		int tamanhoLista = e.getTamanhoDaLista("listaTributaveis");
		for (int i = 0; i < tamanhoLista; i++) {
			Tributavel t = e.getTributavel("listaTributaveis", i);
			total+= t.getValorImposto();
		}
	}
	
	public double getTotal(){
		return this.total;
	}

}
