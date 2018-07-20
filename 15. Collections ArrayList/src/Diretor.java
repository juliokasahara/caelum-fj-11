
public class Diretor implements Comparable<Diretor> {
	private String nome;
	private double altura;
	private int anosDeCasa;
	private double notaDeSatisfacao;
	private String escola;

	public Diretor(String nome, double altura, int anosDeCasa, double notaDeSatisfacao, String escola) {
		this.nome = nome;
		this.altura = altura;
		this.anosDeCasa = anosDeCasa;
		this.notaDeSatisfacao = notaDeSatisfacao;
		this.escola = escola;
	}

	public String getNome() {
		return nome;
	}

	public double getAltura() {
		return altura;
	}

	public int getAnosDeCasa() {
		return anosDeCasa;
	}

	public double getNotaDeSatisfacao() {
		return notaDeSatisfacao;
	}

	public String getEscola() {
		return this.escola;
	}

	@Override
	public int compareTo(Diretor outroDiretor) {
		if(this.notaDeSatisfacao < outroDiretor.notaDeSatisfacao){
			return 1;
		}else if (this.notaDeSatisfacao > outroDiretor.notaDeSatisfacao){
			return -1;
		}else{
			return 0;
		}
	}

	@Override
	public String toString() {
		return "\n" + this.nome + ", altura: " + this.altura + ", Anos de carreira:" + this.anosDeCasa
				+ ", escola atual:" + this.escola + ", Nota:" + this.notaDeSatisfacao;
	}
}
