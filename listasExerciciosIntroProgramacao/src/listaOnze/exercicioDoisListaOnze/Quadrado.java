package exercicioDoisListaOnze;

import java.util.*;

public class Quadrado implements Figura2D {
	double lado;
	String cor;
	
	public Quadrado() {
		System.out.println("Digite o tamanho do lado do quadrado");
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		this.lado = entrada.nextDouble();
	}
	
	@Override
	public double calculaArea() {
		double areaTotalQuadrado = lado * lado;
		System.out.println(areaTotalQuadrado);
		
		return areaTotalQuadrado;
	}

	@Override
	public double calculaPerimetro() {
		double perimetroTotalQuadrado = lado * 4;
		System.out.println(perimetroTotalQuadrado);
		
		return perimetroTotalQuadrado;
	}

	public void mudaCor(String cor) {
	    this.cor = cor;
		
		System.out.println("A cor do quadrado foi alterada para: " + cor);
	}

	@Override
	public String pegaCor() {
	    return "Cor do quadrado: " + cor;
	}
}
