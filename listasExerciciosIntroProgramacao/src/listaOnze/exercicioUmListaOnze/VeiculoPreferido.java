package exercicioUmListaOnze;

public class VeiculoPreferido {
    public void veiculoPreferido(VeiculoDeCorrida[] vArr) {
        int maiorPotencia = 0;
        VeiculoDeCorrida veiculoMaisPotente = null;

        for (VeiculoDeCorrida veiculo : vArr) {
            if (veiculo.cor().equalsIgnoreCase("vermelho") && veiculo.potenciaEmCavalos() > maiorPotencia) {
                maiorPotencia = veiculo.potenciaEmCavalos();
                veiculoMaisPotente = veiculo;
            }
        }

        if (veiculoMaisPotente != null) {
            System.out.println("Veículo vermelho mais potente:");
            System.out.println("Marca: " + veiculoMaisPotente.marca());
            System.out.println("Modelo: " + veiculoMaisPotente.modelo());
            System.out.println("Potencia: " + veiculoMaisPotente.potenciaEmCavalos());            
        } else {
            System.out.println("Não foi encontrado nenhum veículo vermelho.");
        }
    }
}
