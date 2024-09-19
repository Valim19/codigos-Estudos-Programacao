package exercicioDoisListaOnze;

import java.util.Scanner;

public class Circulo implements Figura2D {
	final double PI = 3.14;
	double raio;
	String cor;
	
	public Circulo() {
		System.out.println("Digite o tamanho do raio do seu circulo");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		this.raio = entrada.nextDouble();
	}
	
	@Override
	public double calculaArea() {
		double areaTotalCirculo = PI * raio * raio;
		System.out.println(areaTotalCirculo);
		
		return areaTotalCirculo;
	}

	@Override
	public double calculaPerimetro() {
		double perimetroTotalCirculo = 2 * PI * raio;
		System.out.println(perimetroTotalCirculo);
		
		return perimetroTotalCirculo;
	}

	public void mudaCor(String cor) {
	    this.cor = cor;
		
		System.out.println("A cor do circulo foi alterada para: " + cor);
	}

	@Override
	public String pegaCor() {
	    return "Cor do circulo: " + cor;
	}
}
