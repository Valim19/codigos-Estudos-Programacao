package exercicioTresListaOnze;

public class MensagensBrasileiras implements MensagensSobreNeoNatal {

	@Override
	public String nomeDoBebe(String nome) {
		return nome;
	}

	@Override
	public String dataDeNascimento(Bebe b) {
		String dataDeNascimento = new String(b.diaNascimento() + "/" +
											 b.mesNascimento() + "/" +
											 b.anoNascimento());
		
		return dataDeNascimento;
	}

	@Override
	public String peso(double pesoEmQuilos) {
		String pesoBrasil = pesoEmQuilos + "Kg";
		
		return pesoBrasil;
	}

	@Override
	public String temperatura(double temperaturaEmCelcius) {
		String tempBrasil = temperaturaEmCelcius + "ºC";
		
		return tempBrasil;
	}

}
