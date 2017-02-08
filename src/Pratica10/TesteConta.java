package Pratica10;
import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua agencia:");
		int agencia = sc.nextInt();
		
		System.out.println("\nDigite sua conta:");
		int numc = sc.nextInt();
		
		System.out.println("\nDigite sua senha:");
		int senha = sc.nextInt();
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setAgencia(agencia);
		conta.setNumero(numc);
		conta.autentica(senha);

		if(conta.autentica(senha) == false){
			System.out.println("\nDigite novamente sua senha!");
		}else{
			System.out.println("\nDigite seu saldo:");
			double saldo = sc.nextInt();
			
			System.out.println("\nDigite o limite:");
			double limite = sc.nextInt();
			
			conta.setSaldo(saldo);
			conta.setLimite(limite);
			
			System.out.println("\n O Saldo total é de (Saldo + Limite): \n " + conta.getSaldo());
		}
	}
}