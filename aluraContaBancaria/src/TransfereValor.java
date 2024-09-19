package contaBancaria;

public class TransfereValor {
	private int valorSendoTransferido;
	
	public TransfereValor(int valorSendoTranferido) {
		this.valorSendoTransferido = valorSendoTranferido;
	}
	
	public void transferirValor(DadosDoCliente cliente) {
        double saldoAtual = cliente.getSaldo();
        
        if(saldoAtual >= valorSendoTransferido) {
            saldoAtual -= valorSendoTransferido;
            cliente.setSaldo(saldoAtual);
            System.out.println("O seu saldo atual é: " + saldoAtual);
        } else {
        	System.out.println("Saldo insuficiente para transferencia");
        }

	}
}
