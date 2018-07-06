package Model;

public class Casa {
	private String cor;
	private boolean porta1;
	private boolean porta2;
	private boolean porta3;
	
	
	public int QuantasPortasEstaoAbertas(){
		int quantidade = 0;
		
		if(this.isPorta1())
			quantidade ++;	
		if(this.isPorta2())
			quantidade ++;	
		if(this.isPorta3())
			quantidade ++;	
		
		return quantidade;	
	}
	
	public void Abre(int numPorta){
		if(numPorta == 1){
			setPorta1(true);
		}
		else if(numPorta == 2){
			setPorta2(true);
		}
		else{
			setPorta3(true);
		}
	}
	
	public void Fechar(int numPorta){
		if(numPorta == 1){
			setPorta1(false);
		}
		else if(numPorta == 2){
			setPorta2(false);
		}
		else{
			setPorta3(false);
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isPorta1() {
		return porta1;
	}

	public void setPorta1(boolean porta1) {
		this.porta1 = porta1;
	}

	public boolean isPorta2() {
		return porta2;
	}

	public void setPorta2(boolean porta2) {
		this.porta2 = porta2;
	}

	public boolean isPorta3() {
		return porta3;
	}

	public void setPorta3(boolean porta3) {
		this.porta3 = porta3;
	}
	
}
