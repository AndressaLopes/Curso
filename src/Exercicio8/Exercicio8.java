package Exercicio8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int seguro = 0;
		double imposto = 0;

		System.out.println("Digite o preço do produto: \n");
		int preco = sc.nextInt();

		System.out.println("Escolha o pais de origem: \n");
		System.out.println("1- Estados Unidos\n" + "2- Mexico\n" + "3- Outros\n");

		int pais = sc.nextInt();

		System.out.println("Escolha o meio de transporte: \n");
		System.out.println("T- Terrestre\n" + "F- Fluvial\n" + "A- Aerio\n");

		String trasnsporte = sc.nextLine();

		System.out.println("Carga Perigosa: \n");
		System.out.println("S- Sim\n" + "N- Não\n");

		String perigo = sc.nextLine();

		if (preco < 0) {
			System.out.println("Preço Inválido");

		} else if (preco <= 100) {
			imposto = (preco * 5) / 100;
			System.out.println("O imposto é de: " + imposto);

		} else if (preco > 100) {
			imposto = (preco * 10) / 100;
			System.out.println("O imposto é de: " + imposto);
		}

		if (perigo.equals("S")) {

			switch (pais) {
			case 1:
				System.out.println("Valor do Transporte é de: 50.00");
				break;
			case 2:
				System.out.println("Valor do Transporte é de: 21.00");
				break;
			case 3:
				System.out.println("Valor do Transporte é de: 24.00");
				break;
			default:
				break;
			}

		} else if (perigo.equals("N")) {

			switch (pais) {
			case 1:
				System.out.println("Valor do Transporte é de: 12.00");
				break;
			case 2:
				System.out.println("Valor do Transporte é de: 21.00");
				break;
			case 3:
				System.out.println("Valor do Transporte é de: 60.00");
				break;
			default:
				break;
			}
		}

		if (pais == 2 || trasnsporte.equals("A")) {

			seguro = (preco / 2) + preco;
			System.out.println("Seguro de: " + seguro);
		}

		System.out.println("Preço Final é de: " + preco + seguro + imposto);

	}
}