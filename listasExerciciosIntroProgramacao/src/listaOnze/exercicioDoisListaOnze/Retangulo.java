package exercicioDoisListaOnze;

import java.util.Scanner;

public class Retangulo implements Figura2D {
	double altura;
	double comprimento;
	String cor;
	
	public Retangulo() {
		System.out.println("Digite o tamanho da altura e do comprimento do retangulo, respectivamente");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		this.altura = entrada.nextDouble();
		this.comprimento = entrada.nextDouble();
	}
	
	@Override
	public double calculaArea() {
		double areaTotalRetangulo = altura * comprimento;
		System.out.println(areaTotalRetangulo);
		
		return areaTotalRetangulo;
	}

	@Override
	public double calculaPerimetro() {
		double perimetroTotalRetangulo = (comprimento * 2) + (altura * 2);
		System.out.println(perimetroTotalRetangulo);
		
		return perimetroTotalRetangulo;
	}

	public void mudaCor(String cor) {
	    this.cor = cor;
		
		System.out.println("A cor do retangulo foi alterada para: " + cor);
	}

	@Override
	public String pegaCor() {
	    return "Cor do reatngulo: " + cor;
	}
}
