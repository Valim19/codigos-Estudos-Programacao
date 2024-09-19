package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
   
	public Serie(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}
	
	private int     temporadas;
    private int     episodiosPorTemporada;
    private int     minutosPorEpisodio;
    private boolean ativa;

    	// GETTERS
    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    
    public boolean isAtiva() {
        return ativa;
    }
    
    	// SETTERS
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    	// INHERITANCE
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
    
    @Override
    public String toString() {
    	return "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
