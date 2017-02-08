package Exercicio2;

public class Empregado {

	String nome;
	String funcao;
	Double salario;
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, String funcao, Double salario) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(Double valorAum){
		salario = salario + valorAum;
	}
}
