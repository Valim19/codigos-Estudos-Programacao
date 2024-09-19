package br.com.alura.screenmatch.principal;

import java.util.*;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
        Serie lost = new Serie("Lost", 2000);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);

        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        
        List <Titulo> listaDeAssistidos = new ArrayList<>();
        
		listaDeAssistidos.add(filmeDoPaulo);
		listaDeAssistidos.add(outroFilme);
		listaDeAssistidos.add(meuFilme);
	    listaDeAssistidos.add(lost);
	     
	    for(Titulo item : listaDeAssistidos) {
	    	System.out.println(item.getNome());
	    }
	
	 	List <String> buscaPorArtista = new ArrayList<>();
		
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Paulo");
		buscaPorArtista.add("Anna");
		
		Collections.sort(buscaPorArtista);
		Collections.sort(listaDeAssistidos);
		
		System.out.println(buscaPorArtista);
		System.out.println(listaDeAssistidos);
		
	}
	

}
