
public class Principal {

	public static void main(String[] args) {

		//1:
		System.out.println("Imprima todos os n�meros de 150 a 300.");
		for(int i = 150; i < 301; i++){
			System.out.println(i);
		}
		
		//2:
		System.out.println("Imprima a soma de 1 at� 1000.");
		int soma =0;
		int i = 1;
		while(i < 1001){
			soma += i;
			i++;
		}
		System.out.println("Soma 1 ate 1000 :"+soma);
		
		//3:		
		System.out.println("Imprima todos os m�ltiplos de 3, entre 1 e 100.");
		i = 0;
		do{
			if(i%3 == 0)
			System.out.println(i);
			i++;
		}while(i < 101);
		
		//4:
		System.out.println("Imprima os fatoriais de 1 a 10.");	
		for (int n = 1; n <= 10; n++) {
			int numeroFatorado = Fatorial(n);
			System.out.println("Fatorial de " + i + " = " + numeroFatorado);
		}	
		
		//5:
		System.out.println("Imprima os primeiros n�meros da s�rie de Fibonacci at� passar de 100");

			int num1 = 1, num2 = 0;
		        
			System.out.println(num2);
			System.out.println(num1);
		        
			for(int j = 0; j < 8; j++){
		        num1 = num1 + num2;
		        num2 = num1 - num2;
		        System.out.println(num1);
		    }
		
		
	}
	
	 public static int Fatorial(int num) { 
		if (num == 0) {
			return 1;
		}
		int contador = num; 
		while (contador > 1) {
			num = num * (contador - 1); 
			contador--;
		}
		return num;

	}
}
