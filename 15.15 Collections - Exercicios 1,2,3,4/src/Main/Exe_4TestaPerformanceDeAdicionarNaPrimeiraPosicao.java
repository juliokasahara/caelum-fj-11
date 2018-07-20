package Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exe_4TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {

		System.out.println("Iniciando LinkedList...");
		long inicio = System.currentTimeMillis();

		List<Integer> teste = new LinkedList<>();
		for (int i = 0; i < 3000; i++) {
			teste.add(0, i);
		}
		
		
		for (int i = 0; i < 3000; i++) {
			System.out.print(teste.get(i) + "_");
		}
		
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("\nTempo gasto: " + tempo);
		
		System.out.println("Iniciando ArrayList...");
		long inicioA = System.currentTimeMillis();

		List<Integer> testeA = new ArrayList<>();
		for (int i = 0; i < 3000; i++) {
			testeA.add(0, i);
		}
		
		
		for (int i = 0; i < 3000; i++) {
			System.out.print(testeA.get(i) + "-");
		}
		
		
		long fimA = System.currentTimeMillis();
		double tempoA = (fimA - inicioA) / 1000.0;
		System.out.println("\nTempo gasto: " + tempoA);
	}

}
