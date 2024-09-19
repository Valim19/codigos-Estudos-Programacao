package contaBancaria;

import java.util.Scanner;

public class DadosDoCliente {
	private String nome;
	private String tipoConta;
	private double saldo;
	
	public DadosDoCliente(String nome, double saldo, String tipoConta) {
		this.nome = nome;
		this.saldo = saldo;
		this.tipoConta = tipoConta;

	}
	
   static DadosDoCliente criarCliente() {
       @SuppressWarnings("resource")
       Scanner entrada = new Scanner(System.in);
	   
	   System.out.println("Digite o seu nome: ");
       String nome = entrada.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o tipo de conta (Poupança/Corrente): ");

        String tipoConta = entrada.nextLine();
        defineTipoConta(tipoConta);
        
        return new DadosDoCliente(nome, saldo, tipoConta);
    }
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	private static String defineTipoConta(String tipoConta) {
        boolean contaValidada = false;
		
		do {
            if (tipoConta.equalsIgnoreCase("Poupança") || tipoConta.equalsIgnoreCase("Corrente")) {
                contaValidada = true;
            	return tipoConta;
            } else {
                System.out.println("Tipo de conta inválido, tente novamente (Poupança/Corrente): ");
            }
        } while (contaValidada == false);
		
		return tipoConta;
	}
	
	void imprimeDadosCliente() {
		System.out.println("***********************");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("***********************");
		System.out.println();
	}
	
}
