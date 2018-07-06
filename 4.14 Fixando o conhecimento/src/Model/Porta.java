package Model;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX,dimensaoY,dimensaoZ;
	
	
	public void Abre(){
		this.setAberta(true);
	}
	public void Fechada(){
		this.setAberta(false);
	}
	
	public void Pintar(String cor){
		this.setCor(cor);
	}
	
	public boolean EstaAberta(){
		return isAberta();
	}
	
	private boolean isAberta() {
		return aberta;
	}
	private void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	private void setCor(String cor) {
		this.cor = cor;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	@Override
	public String toString() {
		return "Esta Aberta:" + EstaAberta() + "\nCor:" + getCor() + "\nDimensões X, Y, Z:" + getDimensaoX() + "," + getDimensaoY() + "," + getDimensaoZ();
	}
	
}
