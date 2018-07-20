package view;

import model.Casa;
import model.Porta;

public class Principal {
	public static void main(String[] args) {

		Casa casa = new Casa("Azul", 10);
		System.out.println(casa);

		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		Porta p4 = new Porta();
		Porta p5 = new Porta();

		casa.adicionaPorta(p1);
		casa.adicionaPorta(p2);
		casa.adicionaPorta(p3);
		casa.adicionaPorta(p4);
		casa.adicionaPorta(p5);

		p1.abrirPorta();
		p2.abrirPorta();
		p3.abrirPorta();
		p3.fecharPorta();

		System.out.println(casa);
	}
}
