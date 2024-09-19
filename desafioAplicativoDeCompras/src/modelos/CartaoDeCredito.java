package br.com.alura.aplicativoDeCompras.modelos;

public class CartaoDeCredito {
	private double limiteDeCredito;
	private String proprietarioCartao;
	
	public CartaoDeCredito(String proprietarioCartao, double limiteDeCredito){
		this.limiteDeCredito = limiteDeCredito;
		this.proprietarioCartao = proprietarioCartao;
	}
	
	public double getLimiteDeCredito () {
		return limiteDeCredito;
	}
	
	public String getProprietarioCartao () {
		return proprietarioCartao;
	}
}
