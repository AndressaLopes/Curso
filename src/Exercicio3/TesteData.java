package Exercicio3;

import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) {
		
		Data novaData = new Data();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um dia: \n");
		int dia = sc.nextInt();
		
		System.out.println("Digite um mes: \n");
		int mes = sc.nextInt();
		
		System.out.println("Digite um ano: \n");
		int ano = sc.nextInt();
		
		novaData.validarDia(dia);
		novaData.validarMes(mes);
		novaData.validarAno(ano);
		
		novaData.exibirData();
	}

}
