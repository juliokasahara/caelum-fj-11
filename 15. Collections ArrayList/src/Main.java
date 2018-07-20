import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		ArrayList<String> alunos = new ArrayList<>();
		List<Integer> saldos = new LinkedList<>();

		// retorno true or false metodo add
		System.out.println("Metodo add existe um retorno");
		System.out.println(alunos.add("julio"));
		alunos.add("Ana");
		alunos.add("Carlos");
		alunos.add("Marcos");
		alunos.add("Bia");
		alunos.add("Rodrigo");

		saldos.add(15);
		saldos.add(45);
		saldos.add(32);
		saldos.add(11);
		saldos.add(50);
		
		System.out.println("Contains! julio como aluno?");
		System.out.println(alunos.contains("julio"));

		System.out.println("\nIterator com For");
		Iterator<Integer> interacao = saldos.iterator();
		for (int i = 0; i < saldos.size(); i++) {
			if (interacao.hasNext()) {
				System.out.println(interacao.next());
			}
		}

		System.out.println("\nIterator com Foreach");
		for (Iterator<String> interacaoAlunos = alunos.iterator(); interacaoAlunos.hasNext();){
			System.out.println(interacaoAlunos.next());
		}
		
		
		System.out.println("\nTestando Sort (String)");
		List<String> professor = new ArrayList<>();
		professor.add("Rogerio");
		professor.add("Beatriz");
		professor.add("Lucas");
		professor.add("Elaine");	
		System.out.println("\nProfessores adicionados em ordem de inserção!");	
		System.out.println(professor);
		Collections.sort(professor);
		System.out.println("Lista ordenada...");
		System.out.println(professor);
		System.out.println("String é um Comparable(implements Comparable<String>), e dentro da String.class existe o metodo que satisfaça o Sort (comparaTo) que está ordenado de forma alfabética");
		
		
		System.out.println("\nTestando Sort (Objeto)");
		Diretor b = new Diretor("Antonio", 1.72, 10, 7.2,"B");
		Diretor c = new Diretor("Ricardo", 1.80, 15, 7.5,"C");
		Diretor d = new Diretor("Willian", 1.61, 19, 9.1, "D");
		Diretor a = new Diretor("Carla", 1.70, 3, 8.5,"A");

		
		Collection<Diretor> ListaDiretores = new ArrayList<>();
		ListaDiretores.add(b);
		ListaDiretores.add(c);
		ListaDiretores.add(d);
		ListaDiretores.add(a);
		
		System.out.println("Por ordem de inserção");
		System.out.println(ListaDiretores);
		
		Collections.sort((List<Diretor>)ListaDiretores);
		System.out.println("\nMetodo sort ordenado conforme implementação do programador no compareTo(Nota)...\n");	
		System.out.println("Collections.sort" + ListaDiretores);
		
		Collections.rotate((List<Diretor>) ListaDiretores,3);	
		System.out.println("\nCollections.rotate (rotacionar) 3 vezes" + ListaDiretores);
		
		Collections.shuffle((List<Diretor>) ListaDiretores);	
		System.out.println("\nCollections.shuffle (embaralhada)" + ListaDiretores);
		
		Collections.reverse((List<Diretor>) ListaDiretores);	
		System.out.println("\nCollections.reverse (inverter a ordem)" + ListaDiretores);
		
		/*
		 * Para que uma lista seja: invertida, usa-se o método Collections.reverse(lista); 
		 *embaralhada, usa-se o método Collections.shuffle(lista);
		 *rotacionada, usa-se o método Collections.rotate(lista);
		*/
		
		
	}

}
