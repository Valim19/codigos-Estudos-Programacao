package classes_TestesUnitarios_Java;

import java.util.Scanner;

class exerciciosLista8 {

	public static void main(String[] args){
		int A, B, C, restoA, restoB, numero;
	
		System.out.println("Digite um número qualquer de três dígitos");
		try (Scanner entrada = new Scanner(System.in)) {
			numero = entrada.nextInt();
		}
		if (numero < 1000 && numero > 99) { 
			A = numero / 100;
			restoA = numero % 100;
			B = restoA / 10;
			restoB = restoA % 10;
			C = restoB;

			System.out.println(C+""+B+""+A);
		} else {
			System.out.println("Número Inválido, digite um número de três digitos entre 100 e 999");
		}

	
	}

}