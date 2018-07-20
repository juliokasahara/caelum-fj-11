package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private int numero;
	private List<Conta> contas;

	public void adiciona(Conta conta) {
		try {
			contas.add(conta);
			System.out.println("Conta adicionado com sucesso!!");
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
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public List<Conta> getContas() {
		return contas;
	}

}
