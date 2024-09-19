package exercicioCincoListaOnze;

public class FuncionarioComum implements SalarioFuncionario {
	@SuppressWarnings("unused")
	private String nome;
	private double valorHB;
	private double valorTotalHE;
	
	public FuncionarioComum(double valorHB) {
		if (valorHB <= 200) {
			this.valorHB = valorHB;
		} else {
			throw new IllegalArgumentException("Erro, valor acima do máximo permitido");
		}
	}

	@Override
	public void defineNome(String nome) {
		this.nome = nome;
		System.out.println(nome);
	}

	@Override
	public void valorHoraBase(double hora) {
		this.valorHB = hora;
	}

	@Override
	public double calculaHE(int quantidade) {
		if (quantidade > 0) {
			if(quantidade <= 40) {
				valorTotalHE = quantidade * valorHB;
			} else {
				valorTotalHE = 40 * valorHB;
			}
		}
		
		return valorTotalHE;
	}

	@Override
	public double calculaSalarioFinal() {
		double salarioFinal = (valorHB * 200) + valorTotalHE;
		
		return salarioFinal;
	}
	
	public String cadastreCargoFuncionario(String cargo) {
		return cargo;
	}
	
	public String dataDeAdmissao (int dia, int mes, int ano) {
		String data = new String(dia + "/" +
								 mes + "/" +
								 ano);
		
		return data;
	}

}
