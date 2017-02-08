package Exercicio3;

public class Data {

	Integer dia;
	Integer mes;
	Integer ano;
	
	public Data(Integer dia, Integer mes, Integer ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data() {
		super();
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void exibirData(){
		System.out.println(+ dia + "/" + mes + "/" + ano);
	}
	
	public void validarDia(int dia){
		
		if (dia < 1 || dia > 31){
			this.dia = 1;
		}
	}
	
	public void validarMes(int mes){
		if (mes < 1 || mes > 12){
			this.mes = 1;
		}
	}

	public void validarAno(int ano){
		if (ano < 1){
			this.ano = 2017;
		}
	}
}
