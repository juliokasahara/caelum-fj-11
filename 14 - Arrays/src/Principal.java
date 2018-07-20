
public class Principal {
	public static void main(String[] args) {
		int[] idade = new int[10];
		
		for(int i = 0 ; i < 10; i++){
			idade[i] = i*2;
			System.out.println("adicionado no array " + i + "->Posição, valor:"+idade[i]);
		}

		for (int num : idade) {
			System.out.println("->Posição, valor:"+ num);
		}		
	}
}
