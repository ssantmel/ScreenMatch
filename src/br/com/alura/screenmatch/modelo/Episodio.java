package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {

    private int numero;
    private String nome;
    private Serie serie;
    private int totalAvaliacoes;
    private int totalVisualizacoes;


    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao() {
        if (totalAvaliacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
