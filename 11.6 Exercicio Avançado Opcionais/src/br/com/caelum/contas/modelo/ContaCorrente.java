package br.com.caelum.contas.modelo;


public class ContaCorrente implements Conta, Tributavel{

	private double saldo;
	private double imposto = 0.1;
	private int numero;
	private int agencia;
	
	Cliente titular = new Cliente();
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public String saca(double valor) {
		this.saldo -= valor;
		return "saque ok";
	}

	@Override
	public void atualiza(double taxaSelic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getValorImposto() {
		 return this.saldo * imposto;
	}

	@Override
	public Cliente getTitular() {
		return this.titular;
	}

	@Override
	public String getTipo() {
		return "Conta Corrente + Seguro de Vida";
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

	public String recuperaDadosParaImpressao(){
		String dados = "Dados salvo com sucesso!\nTitular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	@Override
	public String transferePara(Conta destino, double double1) {
		
		return null;
	}
		
}
