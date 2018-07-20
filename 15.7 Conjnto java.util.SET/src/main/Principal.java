package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<String> cargos = new HashSet<>();
		System.out.println("Insert com sucesso? " + cargos.add("Gerente"));
		System.out.println("Insert com sucesso? " + cargos.add("Diretor"));
		System.out.println("Insert com sucesso? " + cargos.add("Presidente"));
		System.out.println("Insert com sucesso? " + cargos.add("Secretária"));
		System.out.println("Insert com sucesso? " + cargos.add("Funcionário"));
		System.out.println("Insert com sucesso? " + cargos.add("Diretor"));

		System.out.println("Todos os cargos:" + cargos);

		System.out.println("\nForeach em um HashSet é usado o Iterator da Collection");
		Set<String> conjunto = new HashSet<>();
		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");

		System.out.println("\npercorrendo com foreach");
		for (String porcorredor : conjunto) {
			System.out.println(porcorredor);
		}

		System.out.println("\npercorrendo com o iterator");
		Iterator<String> i = conjunto.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(conjunto);

	}

}
