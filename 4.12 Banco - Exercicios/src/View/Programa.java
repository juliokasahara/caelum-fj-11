package View;

import Model.Conta;

public class Programa {
	public static void main(String[] args) {
		
		//Exercícios 1,2,3
		Conta ContaJulio;
		ContaJulio = new Conta(100, 1000, "Julio Cesar","Dias Kasahara", "12485423187");
		Conta ContaAline = new Conta(10, 100, "aline", "123456789");
		
		System.out.println(ContaJulio);
		System.out.println("------------------------");
		System.out.println(ContaAline);
				
		
		
		
		// Exercício 4:comparando referencias 
		Conta c1 = new Conta(10,10,"Danilo","123456");
		Conta c2 = new Conta(10,10,"Danilo","123456");
		
		if(c1 == c2){
			System.out.println("Iguais");
		}else{
			System.out.println("não é iguais");
		}
		
		// Exercício 5:Crie duas referências para a mesma conta
		c1 = c2;
		if(c1 == c2){
			System.out.println("Iguais");
		}else{
			System.out.println("não é iguais");
		}

	}
}
