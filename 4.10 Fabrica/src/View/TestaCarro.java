package View;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author julio
*/

import Model.Carro;

public class TestaCarro {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.setCor("Verde");
		meuCarro.setModelo("Fusca");
		meuCarro.setVelocidadeAtual(0);
		meuCarro.setVelocidadeMaxima(100);
		
		meuCarro.Ligar();
		
		meuCarro.Acelerar(20);
		
		System.out.println(meuCarro.getVelocidadeAtual());
		
	}
}
