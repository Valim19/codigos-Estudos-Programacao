package contaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String menu = """
					BEM VINDO A SUA CONTA BANCÁRIA. 
					ESCREVA O NÚMERO DA OPÇÃO DO MENU QUE DESEJA UTILIZAR HOJE:
					1 -> CONSULTAR SALDO
					2 -> TRANSFERIR VALOR
					3 -> RECEBER VALOR
					4 -> SAIR DA APLICAÇÃO
					""";
		
		try {
			DadosDoCliente cliente = DadosDoCliente.criarCliente();
			
			int opcaoEscolhida = 0;
			
			do {
				@SuppressWarnings("resource")
				Scanner entrada = new Scanner(System.in);
				
				System.out.println(menu);
				
				opcaoEscolhida = entrada.nextInt();
				
				if (opcaoEscolhida == 1) { // CONSULTAR SALDO
					
					cliente.imprimeDadosCliente();
					
				} else if (opcaoEscolhida == 2) { // TRANSFERIR VALOR
					
					int valorSendoTransferido = entrada.nextInt();
					TransfereValor transferindo = new TransfereValor(valorSendoTransferido);
					transferindo.transferirValor(cliente);
					
				} else if (opcaoEscolhida == 3) { // RECEBER VALOR
					
					int valorSendoRecebido = entrada.nextInt();
					RecebeValor recebendo = new RecebeValor(valorSendoRecebido);
					recebendo.receberValor(cliente);
					
				} else if (opcaoEscolhida == 4) { // SAIR DA APLICAÇÃO
					
					System.out.println("Obrigada por utilizar nossos serviços");
					break;
					
				} else {
					
					System.out.println("Opção inválida, tente novamente");
					opcaoEscolhida = 0;
					
				}
				
			} while (opcaoEscolhida != 4);
			
		} catch (Exception e) {
            e.printStackTrace();
		}
		
	}

}
