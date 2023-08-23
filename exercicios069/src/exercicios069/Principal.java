package exercicios069;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta conta; // Deve declarar assim *LOGO NO COMEÇO*, pois existem construtores na funçao conta
		
		System.out.println("Digite o numero da sua Conta: " );
		double nconta = sc.nextDouble();
		System.out.println("Digite o nome do titular da Conta: " );
		String name = sc.next();
		System.out.println("Deseja fazer um deposito incial" );
		String name2 = sc.next();
		if (name2.equals("sim")) {
			System.out.println("Digite o Valor do Deposito" );
			double vinicial = sc.nextDouble();
			conta = new Conta(nconta, name, vinicial); // construtor 1(declarado no conta.java), sempre apos salvar os valores necessarios para usar.
			System.out.println(conta);
			
		} else { 
			conta = new Conta(nconta, name);	// construtor 2(declarado no conta.java), sempre apos salvar os valores necessarios para usar.	               
			System.out.println(conta); 
			
			
			}
		System.out.println("Faca um Deposito: ");
		double vinicial3 = sc.nextDouble();
		conta.deposito(vinicial3); // PUXAR FUNÇAO (METODOS) // // vinicial3 referencia ao parametro double novovalorr do metodo deposito *NECESSARIO PARA FUNCIONAMENTO CORRETO*
		System.out.println("Update: " + conta); // "conta" chama o "public String toString()" no Conta.java
		
		System.out.println("Faca uma Retirada de saldo: ");
		double vinicial2 = sc.nextDouble(); 
		conta.retirada(vinicial2); // PUXAR FUNÇAO (METODOS) // vinicial2 referencia ao parametro double novovalorr do metodo retirada *NECESSARIO PARA FUNCIONAMENTO CORRETO*
		System.out.println("Update: " + conta); // "conta" chama o "public String toString()" no Conta.java
		
		sc.close();

	}

}



