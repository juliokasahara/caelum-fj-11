package Main;
import java.util.ArrayList;
import java.util.Collection;

public class Exe1_ArrayListVSHashSet {
	static int totalAdd = 10000;

	public static void main(String[] args) {
		System.out.println("Iniciando ArrayList com total de add:" + totalAdd);
		
		//Collection<Integer> test = new Queue<>();
		Collection<Integer> testeArrayList = new ArrayList<>();

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < totalAdd; i++) {
			testeArrayList.add(i);
		}

		long fimAddInicioArrayList = System.currentTimeMillis();

		for (int i = 0; i < totalAdd; i++) {
			testeArrayList.contains(i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("fim ArrayList.");
		long tempo = fim - inicio;
		long tempoAdd = fimAddInicioArrayList - inicio;
		long tempoContains = fim - fimAddInicioArrayList;

		System.out.println("Tempo gasto Add ArrayList: " + tempoAdd);
		System.out.println("Tempo gasto Contains ArrayList: " + tempoContains);
		System.out.println("Tempo gasto ArrayList: " + tempo);

		System.out.println("-----------------------------------------------------------");

		System.out.println("Iniciando HashSet com total de add:" + totalAdd);
		Collection<Integer> testeHashSet = new ArrayList<>();

		long inicioHashSet = System.currentTimeMillis();
		for (int i = 0; i < totalAdd; i++) {
			testeHashSet.add(i);
		}
		long fimAddInicioContainsHashSet = System.currentTimeMillis();
		for (int i = 0; i < totalAdd; i++) {
			testeHashSet.contains(i);
		}
		long fimHashSet = System.currentTimeMillis();
		System.out.println("fim HashSet.");
		long tempoHashSet = fimHashSet - inicioHashSet;
		long tempoAddH = fimAddInicioContainsHashSet - inicioHashSet;
		long tempoContainsH = fimHashSet - fimAddInicioContainsHashSet;

		System.out.println("Tempo gasto Add ArrayList: " + tempoAddH);
		System.out.println("Tempo gasto Contains ArrayList: " + tempoContainsH);
		System.out.println("Tempo gasto HashSet: " + tempoHashSet);

	}
}
