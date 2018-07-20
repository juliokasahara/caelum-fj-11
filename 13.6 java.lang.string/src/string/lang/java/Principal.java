package string.lang.java;

public class Principal {

	public static void main(String[] args) {
		String a = new String("Test");
		String b = new String("Test");

		if (a == b) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}

		if (a.equals(b)) {
			System.out.println("consideramos iguais no critério de igualdade");
		} else {
			System.out.println("consideramos diferentes no critério de igualdade");
		}
		
		a += "e";
		System.out.println("letra e adicionado com sucesso = " + a);
		
		if (a.equals(b)) {
			System.out.println("consideramos iguais no critério de igualdade");
		} else {
			System.out.println("consideramos diferentes no critério de igualdade");
		}
		
		String palavra = "fj11";
		palavra.toUpperCase();
		System.out.println(palavra);
		
		String outra = palavra.toUpperCase();
		System.out.println(outra);
		
		
		String palavraReplace = "fj11";
		palavraReplace = palavraReplace.toUpperCase();
		palavraReplace = palavraReplace.replace("1", "2");
		System.out.println(palavraReplace);

	}

}
