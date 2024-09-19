package br.com.alura.aplicativoDeCompras.calculos;

import br.com.alura.aplicativoDeCompras.modelos.CartaoDeCredito;

public class SaldoCartaoDeCredito {
	private double saldoRestante;
	
	public double getSaldoRestante () {
		return saldoRestante;
	}
	
	public double realizarCompra(CartaoDeCredito c, double valorCompra) {
	    if (valorCompra > saldoRestante) {
			System.out.println("O seu limite de " + saldoRestante +" é insuficiente, escolha outro item ou finalize a compra");
	        return saldoRestante;
	    } else {
	        saldoRestante -= valorCompra;
	        return saldoRestante;
	    }
	}
}
