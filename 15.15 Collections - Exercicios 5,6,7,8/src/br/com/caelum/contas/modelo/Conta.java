package br.com.caelum.contas.modelo;

public abstract class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private static int totalDeContas;
	private int agencia;


	// Obriga todas as subclasse implementar o metodo.
	public abstract String getTipo();

	public Cliente titular = new Cliente();
	
	public Conta(String nome) {
		this.titular.setNome(nome);
		Conta.totalDeContas++;
	}

	public String saca(double valor) {
		if (getSaldo() >= valor) {
			this.setSaldo(getSaldo() - valor);
			return "Saque efetuado com Sucesso da ";
		} else {
			return "Erro: saldo insuficiente -";
		}
	}


	public void deposito(double valor) {
		if (valor > -1) {
			this.setSaldo(getSaldo() + valor);

		} else {
			System.out.println("Impossivel depositar valor negativo");
		}
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
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		// chamada de um metodo abstrato dentro da classe que definiu o proprio
		// metodo como abstrato
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	@Override
	public String toString() {
		return "[titular=" + this.titular.getNome() + ", numero=" + this.getNumero() + ", agencia=" + this.getAgencia()
				+ "] ";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numero;
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
