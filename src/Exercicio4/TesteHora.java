package Exercicio4;

import java.util.Scanner;

import Exercicio3.Data;

public class TesteHora {

	public static void main(String[] args) {
		
		Hora novaHora = new Hora();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma hora: \n");
		int hora = sc.nextInt();
		
		System.out.println("Digite um minuto: \n");
		int minuto = sc.nextInt();
		
		System.out.println("Digite um segundo: \n");
		int segundo = sc.nextInt();
		
		
	
		novaHora.obterHora(hora, minuto, segundo);

	}

}
