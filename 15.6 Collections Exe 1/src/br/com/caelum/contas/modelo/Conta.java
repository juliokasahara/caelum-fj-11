package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta>{
	private int numero;
	private double saldo;
	private double limite;
	private static int totalDeContas;
	private int agencia;

	public Conta() {
		Conta.totalDeContas++;
	}

	// Obriga todas as subclasse implementar o metodo.
	public abstract String getTipo();

	public Cliente titular = new Cliente();

	public String saca(double valor) {
		if (getSaldo() >= valor) {
			this.setSaldo(getSaldo() - valor);
			return "Saque efetuado com Sucesso da ";
		} else {
			return "Erro: saldo insuficiente -";
		}
	}

	public void deposito(double valor) {
		if (valor > 0) {
			this.setSaldo(getSaldo() + valor);

		} else {
			System.out.println("Impossivel depositar valor negativo");
		}
	}
	
	@Override
	public int compareTo(Conta o) {
		return this.titular.getNome().compareTo(o.titular.getNome());
	}

	
	// pag:191
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia == outraConta.agencia;
		//return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	public String transferePara(Conta conta, double valor) {
		if (this.getSaldo() >= valor) {
			conta.deposito(valor);
		}
		return saca(valor);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public Cliente getTitular() {
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Dados salvo com sucesso!\nTitular: " + this.titular;
		dados += "\nN�mero: " + this.numero;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	@Override
	public String toString() {
		return "[titular=" + this.titular.getNome() + ", numero=" + this.getNumero() + ", agencia=" + this.getAgencia()
				+ "] ";
	}

}
