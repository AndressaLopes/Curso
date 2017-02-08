package Exercicio7;

import java.util.Scanner;

public class TesteSal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario: \n");
		int sal = sc.nextInt();
		
		System.out.println("Escolha uma das opções abixo: \n");
		System.out.println("1- Imposto\n"
				+ "2- Novo Salario\n"
				+ "3- Classificação\n"
				+ "4- Finalizar Programa\n");
		
		int opc = sc.nextInt();

		switch (opc) {
		
		case 1:
			if (sal > 500){
				double imposto = (sal * 5)/100;
				System.out.println("O imposto é de: " + imposto);
				
			}else if (sal >= 500 && sal <=850){
				double imposto = (sal * 10)/100;
				System.out.println("O imposto é de: " + imposto);
				
			}else if (sal > 850){
				double imposto = (sal * 15)/100;
				System.out.println("O imposto é de: " + imposto);
			}
		break;
			
		case 2:
			if(sal > 1500){
				double aumento = (sal + 25);
				System.out.println("Salario com aumento: " + aumento);
				
			}else if (sal >= 750 && sal <= 1500){
				double aumento = (sal + 50);
				System.out.println("Salario com aumento: " + aumento);
				
			}else if (sal >= 450 && sal <= 750){
				double aumento = (sal + 75);
				System.out.println("Salario com aumento: " + aumento);
				
			}else if (sal < 450){
				double aumento = (sal + 100);
				System.out.println("Salario com aumento: " + aumento);
				
			}
		break;
			
		default:
			System.out.println("Programa Finalizado com Sucesso");
			break;
		}
	}

}
