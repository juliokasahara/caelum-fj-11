package br.com.caelum.contas.modelo;

public class Banco {
	private static int id = 0;
	private String nome;
	private int numero;
	private Conta[] contas;

	public void adiciona(Conta conta) {
		try {
			contas[id] = conta;
			System.out.println("Conta adicionado com sucesso!!");
			id++;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Erro ao executar Array está completo");
		}
	}

	public void mostraContas() {
		for (Conta x : getContas()) {
			System.out.println(x);
		}
	}

	public boolean contem(Conta conta) {
		for (Conta contaDoBanco : contas) {
			if(contaDoBanco.titular.getNome().equals(conta.titular.getNome())){
				return true;
			}
		}
		return false;
	}

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public Conta[] getContas() {
		return contas;
	}

}
