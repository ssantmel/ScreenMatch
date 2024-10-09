package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PricipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        var filmeDoPaulo = new Filme("dogvile", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("lost", 2000);
        lost.avalia(8);
        Filme outroFilme = new Filme("Avatar !!", 1994);
        outroFilme.avalia(7);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //foreach : para cada item da minha lista , printar o titulo.

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao()< 2){
                System.out.println("Classificação" + filme.getClassificacao());

            }
        }
         ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Samira");
        buscaPorArtista.add("Helo");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação :" + buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por anos ");
        System.out.println(lista);
    }
}
