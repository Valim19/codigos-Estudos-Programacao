package exercicioDoisListaOnze;

public class Main {
	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		q.calculaArea();
		q.calculaPerimetro();
		q.mudaCor("Vermelho");
		System.out.println(q.pegaCor());
		
		Retangulo r = new Retangulo();
		r.calculaArea();
		r.calculaPerimetro();
		r.mudaCor("Vermelho");
		System.out.println(r.pegaCor());
		
		Circulo c = new Circulo();
		c.calculaArea();
		c.calculaPerimetro();
		c.mudaCor("Vermelho");
		System.out.println(c.pegaCor());
	}
}
