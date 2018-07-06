package Model;

import java.time.LocalDate;
import java.util.Random;

public class Conta {
	private int numero;
	private double contaCorrente;
	private double limite = 100;
	private double contaPoupanca;
	private Cliente titular;
	private LocalDate abertura;
	
	public Conta(double contaCorrente, double contaPoupanca,String nome,String cpf) {
		this(contaCorrente,contaPoupanca,nome,"",cpf);
	}
	
	
	public Conta(double contaCorrente, double contaPoupanca,String nome,String sobrenome,String cpf) {
		this.setContaCorrente(contaCorrente);
		this.setContaPoupanca(contaPoupanca);
		titular = new Cliente(nome,sobrenome,cpf);
		Random numeroConta = new Random(); 
		this.setNumero(numeroConta.nextInt(100));
		abertura = LocalDate.now();
	}


	public boolean Sacar(double valor){
		if(getContaCorrente() > valor){		
			this.setContaCorrente(getContaCorrente() - valor);
			return true;
		}else{
			return false;
		}
	}
	
	public void Deposito(double valor){
			this.setContaCorrente(getContaCorrente() + valor);
	}
	
	public boolean TransferePara(Conta conta,double valor){
		if(this.Sacar(valor)){
			conta.Deposito(valor);
			return true;
		}else{
			return false;
		}
	}
	
	public String CalculaRendimento(){
		return "Rendimento mensal:" + getContaPoupanca() / 100 * 0.1;
	}
	

	@Override
	public String toString() {
		String extrato;
		extrato = "Dados da conta n�:" + this.getNumero() + getTitular()+ " \nConta Corrente:" + this.getContaCorrente() + "\nConta Poupan�a:";
		extrato += this.getContaPoupanca() + "\nLimite:" + this.getLimite() + "\nCliente desde:" + getAbertura() + "\n" + CalculaRendimento();
		return extrato;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getContaCorrente() {
		return contaCorrente;
	}


	public void setContaCorrente(double contaCorrente) {
		this.contaCorrente = contaCorrente;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public double getContaPoupanca() {
		return contaPoupanca;
	}


	public void setContaPoupanca(double contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public LocalDate getAbertura() {
		return abertura;
	}

	public void setAbertura(LocalDate abertura) {
		this.abertura = abertura;
	}
	
}
