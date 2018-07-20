package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente> {

	public ContaCorrente(String nome) {
		super(nome);
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public String saca(double valor) {
		return super.saca(valor + 0.10) + " Conta Corrente.";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public Cliente getTitular() {
		return this.titular;
	}

	@Override
	public String toString() {
		return super.toString() + "- Conta Corrente";
	}

	@Override
	public int compareTo(ContaCorrente outra) {
		
		// Ordena por numero
		return Integer.compare(this.getNumero(), outra.getNumero());
		
		// ordena por saldo
		/*
		if (this.getSaldo() < outra.getSaldo()) {
			return -1;
		}
		if (this.getSaldo() > outra.getSaldo()) {
			return 1;
		}
		return 0;
		*/
	}
}
