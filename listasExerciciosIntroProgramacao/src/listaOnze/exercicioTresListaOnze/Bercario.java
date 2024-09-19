package exercicioTresListaOnze;

public class Bercario {
	Bebe[] listaDeBebes;
	
	// aqui vão os métodos para inserção e remoção de bebês da lista
	
	void imprimeDadosSobreBebe(Bebe b, MensagensSobreNeoNatal m) {
		System.out.println(m.nomeDoBebe(b.nome()));
		System.out.println(m.dataDeNascimento(b));
		System.out.println(m.peso(b.peso()));
		System.out.println(m.temperatura(b.temperatura()));
	}
	
	void imprime(int IDdoBebe, String idioma) {
		MensagensSobreNeoNatal m;
		if (idioma.equals("Portugues"))
			m = new MensagensBrasileiras();
		else
			m = new MensagensEstadoUnidense();
		
		imprimeDadosSobreBebe(listaDeBebes[IDdoBebe], m);
	}
}
