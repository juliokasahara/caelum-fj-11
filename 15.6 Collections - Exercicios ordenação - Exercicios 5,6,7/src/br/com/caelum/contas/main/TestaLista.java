package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaLista {

	private Conta conta;
	static Collection<Conta> contas = new LinkedList<>();
	
	static Random numAleatorio = new Random();

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			ContaCorrente contaCorrente = new ContaCorrente();
			ContaPoupanca contaPoupanca = new ContaPoupanca();			
			contaCorrente.deposito(numAleatorio.nextInt(100));
			contaPoupanca.deposito(numAleatorio.nextInt(100));
			contas.add(contaCorrente);
			contas.add(contaPoupanca);
		}
		System.out.println(contas);
		
		Collection<Conta> copiaReferencia = new ArrayList<>();
		copiaReferencia = contas;
		
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();			
		contaCorrente.deposito(numAleatorio.nextInt(100));
		contaPoupanca.deposito(numAleatorio.nextInt(100));
		copiaReferencia.add(contaCorrente);
		copiaReferencia.add(contaPoupanca);
		
		System.out.println(contas);		
		System.out.println(copiaReferencia);

	}
}
