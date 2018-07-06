package View;

import Model.*;

public class Principal {
	public static void main(String[] args) {
	
		System.out.println("--------- Programa 1 ---------");
		
		Pessoa julio = new Pessoa("julio",11);
		System.out.println(julio);
		julio.FazAniversario();
		julio.FazAniversario();
		System.out.println(julio);
		
		System.out.println("--------- Programa 2 ---------");
		
		Porta portaCasa = new Porta();
		System.out.println(portaCasa.EstaAberta());
		portaCasa.Abre();
		portaCasa.Pintar("Azul");
		portaCasa.setDimensaoZ(5);
		portaCasa.setDimensaoX(10);
		portaCasa.setDimensaoY(15);
		System.out.println(portaCasa);
		
		System.out.println("--------- Programa 3 ---------");
		
		Casa casaJulio = new Casa();
		System.out.println("Portas abertas:" + casaJulio.QuantasPortasEstaoAbertas());
		casaJulio.Abre(1);
		casaJulio.Abre(2);
		System.out.println("Portas abertas:" + casaJulio.QuantasPortasEstaoAbertas());
		
	}
}
