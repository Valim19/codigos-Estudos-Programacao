package br.com.alura.aplicativoDeCompras.menu;

import br.com.alura.aplicativoDeCompras.modelos.CartaoDeCredito;

import java.util.Scanner; 

public class Menu {
	public static void main (String[] args) {
		
		// System.out.println(c1.getLimiteDeCredito());
		// System.out.println(c1.getProprietarioCartao());
		
		String mensagemMenu = 
				"""
				Pressione o número da opção que deseja no menu
				1 - Cadastrar o seu nome e o limite de seu cartão de crédito
				2 - Ver o catálogo de todas as opções disponíveis para compra
				3 - Escolher um item para compra
				4 - Acessar o seu carrinho de compras
				5 - Finalizar a sua compra
				""";
		
		int opcaoEscolhida = 0;
		try (Scanner scan = new Scanner(System.in)) {
			do {
				
				if (opcaoEscolhida == 0) {
					System.out.println(mensagemMenu);
					opcaoEscolhida = scan.nextInt();
			    } else if (opcaoEscolhida == 1) {
					CartaoDeCredito c1 = new CartaoDeCredito("Anna Carolina", 2000.0);
					opcaoEscolhida = 0;
				} else if (opcaoEscolhida == 2) {
					
					opcaoEscolhida = 0;
				} else if (opcaoEscolhida == 3) {
					
					opcaoEscolhida = 0;
				} else if (opcaoEscolhida == 4) {
					
					opcaoEscolhida = 0;
				}
				
			} while(opcaoEscolhida != 5);
		}

	}
}
