package Exercicio2;

public class TesteSalario {

	public static void main(String[] args) {
		
		Empregado funcionario = new Empregado();

		funcionario.setNome("João");
		funcionario.setFuncao("Analista de Sistemas");
		funcionario.setSalario(5400.00);
		
		funcionario.aumentarSalario(600.00);
		
		System.out.println("Nome: \n" + funcionario.getNome());
		System.out.println("Função: \n" + funcionario.getFuncao());
		System.out.println("Salário: \n" + funcionario.getSalario());
	}
}