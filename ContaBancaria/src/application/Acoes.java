package application;

import java.util.Scanner;
import java.util.Locale;
import conta.Conta;

public class Acoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        Conta conta;		
        
		System.out.println("Número da conta:");
		int numeroConta = sc.nextInt();
		System.out.println("Nome do titular:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Deseja depositar? (S/N):");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			System.out.println("informe o valor do depósito:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, titular, depositoInicial);
		}
		else {
		    conta = new Conta(numeroConta, titular);
		}
		
        System.out.println(conta.toString());

   sc.close();
	
	}
}
