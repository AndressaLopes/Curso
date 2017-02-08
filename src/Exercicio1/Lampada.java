package Exercicio1;

public class Lampada {

	String cor;
	Boolean ligada;
	
	public Lampada() {
		super();
		
	}
	
	public Lampada(String cor){
		super();
		this.cor = cor;
	}
	
	public Lampada(String cor, Boolean ligada) {
		super();
		this.cor = cor;
		this.ligada = ligada;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getLigada() {
		return ligada;
	}

	public void setLigada(Boolean ligada) {
		this.ligada = ligada;
	}
	
	
}
