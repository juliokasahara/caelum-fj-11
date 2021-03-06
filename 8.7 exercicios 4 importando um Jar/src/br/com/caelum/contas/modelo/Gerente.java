package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }
    
    public boolean autentica(int senha){
    	if(this.senha == senha){
    		System.out.println("Acesso permitido");
    		return true;
    	}else{
    		System.out.println("Acesso negado");
    		return false;
    	}
    }

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
    
}
