package exercicioTresListaOnze;

public class MensagensEstadoUnidense implements MensagensSobreNeoNatal {

	@Override
	public String nomeDoBebe(String nome) {
		return nome;
	}

	@Override
	public String dataDeNascimento(Bebe b) {
		String dataDeNascimento = new String(b.mesNascimento() + "/" +
											 b.diaNascimento() + "/" +
											 b.anoNascimento());

		return dataDeNascimento;
	}

	@Override
	public String peso(double pesoEmQuilos) {
		String pesoEUA = (pesoEmQuilos * 2.20462) + "pounds";
		
		return pesoEUA;
	}

	@Override
	public String temperatura(double temperaturaEmCelcius) {
		String tempEUA = (temperaturaEmCelcius * 1.8 + 32) + "ºF";
		
		return tempEUA;
	}

}
