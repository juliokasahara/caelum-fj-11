package br.com.caelum.contas.modelo;

public class ContaPoupanca implements Conta {
	
	private double saldo;
	private int numero;
	private int agencia;
	
	private Cliente titular = new Cliente();

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void atualiza(double taxaSelic) {
		// TODO Auto-generated method stub
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public String recuperaDadosParaImpressao(){
		String dados = "Dados salvo com sucesso!\nTitular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		return dados;
	}

	@Override
	public Cliente getTitular() {
		return this.titular;
	}

	@Override
	public String saca(double valor) {
		this.saldo -= valor;
		return "saque ok";
	}

	@Override
	public String transferePara(Conta destino, double double1) {
		// TODO Auto-generated method stub
		return null;
	}
		

}
