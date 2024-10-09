package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;
import java.util.List;


public class Principal {


    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);


        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);

        System.out.println("Total de avaliaões é: " + meuFilme.getTotalAvaliacoes());
       //   System.out.println("Media de filmes: " + meuFilme.pegaMedia());

        Serie lost = new Serie("lost", 2000);

        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(20);
        lost.setMinPorEpisodio(50);
        System.out.println("Duração para maratonar lost " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar !!",2000);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total em minutos : " + calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setSerie(lost);
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);

        var filmeDoPaulo = new Filme("dogvile", 2003);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        List<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        // Mostrar o tamanho da lista (quantos itens há na lista) listaDeFilme.zise()
        System.out.println("Tamanho da lista " + listaDeFilmes.size());

        //nessa linha de codigo abaixo ele pega o primeiro nome da lista de filme -
        // get(0) <-- pegar o primeiro item da lista , getNome <- pegar o nome
        System.out.println("Primeiro filme da lista  " + listaDeFilmes.get(0).getNome());

        System.out.println("toString do filme  " + listaDeFilmes.get(0).toString());
        

    }

}