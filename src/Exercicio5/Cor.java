package Exercicio5;

public class Cor {

	Integer red;
	Integer green;
	Integer blue;
	
	public Cor() {
		super();
	}
	
	public Cor(Integer red) {
		super();
		this.red = red;
	}
	
	public Cor(Integer red, Integer green) {
		super();
		this.red = red;
		this.green = green;
	}
	
	public Cor(Integer red, Integer green, Integer blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		this.green = green;
	}

	public Integer getBlue() {
		return blue;
	}

	public void setBlue(Integer blue) {
		this.blue = blue;
	}
	
	public void obterCor(){
		System.out.println("<red>,<green>,<blue>");
	}
	
}