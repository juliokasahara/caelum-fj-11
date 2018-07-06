package main;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposito(100.);
		System.out.println(cc.getValorImposto());
		// testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
	}
}
