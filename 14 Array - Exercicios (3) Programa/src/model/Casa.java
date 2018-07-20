package model;

public class Casa {
	private String cor;
	private Porta[] portas;

	public String getCor() {
		return this.cor;
	}

	public Casa(String cor, int totalDePortas) {
		this.cor = cor;
		portas = new Porta[totalDePortas];
	}

	public void pintar(String s) {
		this.cor = s;
	}

	public int totalDePortas() {
		int total = 0;
		for (Porta porta : portas) {
			if (porta != null) {
				total++;
			}
		}
		return total;
	}

	public int quantasPortasEstaoAbertas() {
		int totalDePortasAbertas = 0;
		for (Porta porta : portas) {
			if (porta != null && porta.aberto) {
				totalDePortasAbertas++;
			}
		}
		return totalDePortasAbertas;
	}

	public void adicionaPorta(Porta p) {

		for (int i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				portas[i] = p;
				System.out.println("Porta adicionado com sucesso posição:" + (i + 1));
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Total de portas abertas:" + this.quantasPortasEstaoAbertas() + "\nTotal de portas:"
				+ this.totalDePortas();
	}
}
