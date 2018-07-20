package Main;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class Exe3_TestaMapa {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.deposito(1000);
		c1.titular.setNome("Diretor");;
		
		Conta c2 = new ContaCorrente();
		c2.deposito(3000);
		
		// cria o mapa
		
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor",c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		
		System.out.println(contaDoDiretor.getTitular().getNome());
		
	}

}
