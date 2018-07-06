package Model;

public class EmpregadoDaFaculdade {
	
	protected String nome;
	protected double salario;
	
	public EmpregadoDaFaculdade(String nome,double salario){
		this.salario = salario;
		this.nome = nome;
	}
	
	public double getGastos() {
		return salario;
	}
	
	public String getInfo(){
		return "Nome:" + this.nome + " com salario:" + this.getGastos();
	}
	
}
