package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int    numero;
    private int    totalVisualizacoes;
    private Serie  serie;
    private String nome;

    
    	// GETTERS
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }
    
    public Serie getSerie() {
        return serie;
    }
    
    public String getNome() {
        return nome;
    }
    
    	// SETTERS
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }


    	// INHERITANCE
    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
            
        } else {
            return 2;
            
        }
    }
}
