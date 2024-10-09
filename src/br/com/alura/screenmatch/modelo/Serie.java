package br.com.alura.screenmatch.modelo;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinPorEpisodio() {
        return minPorEpisodio;
    }

    public void setMinPorEpisodio(int minPorEpisodio) {
        this.minPorEpisodio = minPorEpisodio;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minPorEpisodio;
    }
    @Override
    public String toString() {
        return "serie " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
