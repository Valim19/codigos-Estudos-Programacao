package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
   
    public Titulo(String nome, int anoDeLancamento) {
    	this.nome = nome;
    	this.anoDeLancamento = anoDeLancamento;
    }
    
    public Titulo(TituloOMDB meuTituloOMDB) {
    	this.nome = meuTituloOMDB.title();
    	this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year());
    	this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0, 2));
    }
	
	@SerializedName("Year")
    private int     anoDeLancamento;
    private int     duracaoEmMinutos;
	private int     totalDeAvaliacoes;
    private double  somaDasAvaliacoes;
	@SerializedName("Title")
    private String  nome;
    private boolean incluidoNoPlano;
    
    
    	// GETTERS
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    
    
    	// SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    
    
    	// METHODS
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

	@Override
	public int compareTo(Titulo outroTitulo) {
		return this.getNome().compareTo(outroTitulo.getNome());
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome + '\'' + 
				", Ano de lançamento = " + anoDeLancamento + 
				", Duração em minutos = " + duracaoEmMinutos;
	}
}
