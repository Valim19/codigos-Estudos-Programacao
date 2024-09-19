package exercicioCincoListaOnze;

public class Gerente implements SalarioFuncionario {
	@SuppressWarnings("unused")
	private String nome;
	private double valorHB;
	private double valorTotalHE;
	
	public Gerente(double valorHB) {
		this.valorHB = valorHB;
	}
	
	
	@Override
	public void defineNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void valorHoraBase(double hora) {
		this.valorHB = hora;
	}

	@Override
	public double calculaHE(int quantidade) {
		if (quantidade > 0) {
			valorTotalHE = quantidade * valorHB * 0.2;
		}
		
		return valorTotalHE;
	}

	@Override
	public double calculaSalarioFinal() {
		double salarioFinal = (valorHB * 180) + valorTotalHE + 2000;

		return salarioFinal;
	}

}
