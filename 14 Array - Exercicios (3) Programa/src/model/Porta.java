package model;

public class Porta {
	protected boolean aberto;
	
	public void abrirPorta(){
		this.aberto = true;
		System.out.println("Abriu a porta");
	}
	
	public void fecharPorta(){
		this.aberto = false;
		System.out.println("Fechou a porta");
	}
	
}
