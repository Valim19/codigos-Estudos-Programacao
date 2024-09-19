package exercicioUmListaOnze;

public class Main {

	public static void main(String[] args) {
        VeiculoDeCorrida[] veiculos = new VeiculoDeCorrida[10];
		
		veiculos[0]= new VeiculosPopulares("Fiat", "Uno", "Cinza", 5000);
		veiculos[1]= new VeiculosPopulares("Fiat", "Uno", "Vermelho", 1000);
		veiculos[2]= new VeiculosPopulares("Fiat", "Uno", "Cinza", 500);
		veiculos[3]= new VeiculosPopulares("Fiat", "Uno", "Vermelho", 100);
		veiculos[4]= new VeiculosPopulares("Fiat", "Uno", "Cinza", 10000);
		
		veiculos[5]= new VeiculosChiques("Porsche", "Porsche", "Vermelho", 100000);
		veiculos[6]= new VeiculosChiques("Ferrari", "Ferrari", "Azul", 100000);
		veiculos[7]= new VeiculosChiques("Porsche", "Porsche", "Amarelo", 1000);
		veiculos[8]= new VeiculosChiques("Lamborguini", "Lamborguini", "Vermelho", 1000000);
		veiculos[9]= new VeiculosChiques("kkkk", "kkkk", "Vermelho", 50000);
        
		VeiculoPreferido preferido = new VeiculoPreferido();
       
        preferido.veiculoPreferido(veiculos);
	}

}
