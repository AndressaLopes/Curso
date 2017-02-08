package Exercicio4;

public class Hora {

	Integer hora;
	Integer minuto;
	Integer segundo;

	public Hora() {
		super();
	}

	public Hora(Integer hora, Integer minuto, Integer segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Integer getSegundo() {
		return segundo;
	}

	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}
	
	public void obterHora(int hora, int minuto, int segundo){
		System.out.println(+ hora + ":" + minuto + ":" + segundo);
	}
	
	
}
