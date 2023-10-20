import java.util.Locale;
import java.util.Scanner;

import entities.Conta;


public class Encapsulamento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Conta conta;
		
		System.out.print("Numero da conta: ");
		int numero_conta = sc.nextInt();
		
		System.out.print("Nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inincial? s/n ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Valor do deposito inicial: R$ ");
			double deposito_inicial = sc.nextDouble();
			conta = new Conta(numero_conta, titular, deposito_inicial);
		} else {
			conta = new Conta(numero_conta, titular);
		}
		
		System.out.println();
		System.out.print("Valor do deposito: R$ ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		sc.close();
	}

}
