package Exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCandidato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Candidato> list = new ArrayList<>();

		boolean parada = true;
		int cont = 0, idade = 0;
		int contF = 0, contM = 0, somaIdadeH = 0, cntM45 = 0, cntMExp = 0, cntFS21 = 0;
		
		ArrayList<Integer> cntFS = new ArrayList<>();

		while (parada) {
			System.out.println("Candidato " + cont + ":");
			System.out.println("Digite a idade:");
			idade = sc.nextInt();
			if (idade == 0) {
				parada = false;
				break;
			} else {
				Candidato c = new Candidato();
				c.setIdade(idade);
				System.out.println("Digite o sexo (M,F):");
				c.setSexo(sc.next().toUpperCase());

				if (c.getSexo().equals("M")) {
					contM++;
					if (idade > 45) {
						cntM45++;
					}
				} else {
					contF++;
				}

				System.out.println("Possui experiencia? (S/N):");
				c.setExp(sc.next().toUpperCase());

				if (c.getSexo().equals("M") && c.getExp().equals("S")) {
					cntMExp++;
					somaIdadeH += idade;
				}

				if (c.getSexo().equals("F") && c.getExp().equals("S")) {
					cntFS.add(idade);
				}

				if (c.getSexo().equals("F") && idade < 21 && c.getExp().equals("S")) {
					cntFS21++;
				}

				list.add(c);
				cont++;
			}

		}

		if (!list.isEmpty()) {
			System.out.println("A - R:" + contF);
			System.out.println("B - R:" + contM);
			System.out.println("C - R:" + (somaIdadeH / cntMExp));
			System.out.println("D - R:" + ((cntM45 * 100) / contM));
			System.out.println("E - R:" + cntFS21);

			if (!cntFS.isEmpty()) {
				int idadeMenor = cntFS.get(0);
				for (Integer i : cntFS) {

					if (cntFS.get(i) < idadeMenor) {
						idadeMenor = cntFS.get(i);
					}
				}
				System.out.println("F - R:" + idadeMenor);
			}
		} else {
			System.out.println("F - R: 0");
		}
	}
}