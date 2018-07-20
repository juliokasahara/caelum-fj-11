package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Banco {

	private String nome;
	private int numero;
	private Collection<Conta> contas;
	Map<String, Conta> contasMap;

	public boolean adiciona(Conta conta) {
		try {
			System.out.print("Conta adicionada, " + conta.getTitular().getNome() + " - adicionou? ");
			if (contas.add(conta)) {
				contasMap.put(conta.titular.getNome(), conta);
				return true;
			}
			return false;

		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Erro ao executar Array está completo");
		}
	}

	public Conta buscaPorTitular(String nomeTitular) {
		return contasMap.get(nomeTitular);
	}

	public void mostraContas() {
		for (Conta x : contas) {
			System.out.println(x);
		}
	}

	public boolean contem(Conta conta) {
		for (Conta contaDoBanco : contas) {
			if (contaDoBanco.titular.getNome().equals(conta.titular.getNome())) {
				return true;
			}
		}
		return false;
	}

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
		this.contasMap = new HashMap<>();
	}

	public Banco(String nome, int numero, boolean hashSet) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new HashSet<>();
		this.contasMap = new HashMap<>();
	}

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}

	public Conta pega(int x) {
		return ((ArrayList<Conta>) contas).get(x);
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public Collection<Conta> getContas() {
		return (Collection<Conta>) contas;
	}

}
