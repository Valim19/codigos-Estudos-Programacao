package contaBancaria;

public class RecebeValor {
	private int valorSendoRecebido;
	

	public RecebeValor(int valorSendoRecebido) {
		this.valorSendoRecebido = valorSendoRecebido;
	}
	
	public void receberValor(DadosDoCliente cliente) {
        double saldoAtual = cliente.getSaldo();
        
        saldoAtual += valorSendoRecebido;
        cliente.setSaldo(saldoAtual);
        System.out.println("O seu saldo atual é: " + saldoAtual);
	}

}
