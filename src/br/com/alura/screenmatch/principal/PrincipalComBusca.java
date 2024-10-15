package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Titulo;
import br.com.alura.screenmatch.modelo.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner  leitura = new Scanner(System.in);
        System.out.println("Digite um filme para a busca ");
        var busca = leitura.nextLine();

        String endereço = "http://www.omdbapi.com/?i=" + busca + "&apikey=6585022";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereço))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        System.out.println(json);

        Gson geson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TituloOMDB meuTituloOmdb = geson.fromJson(json, TituloOMDB.class);
        System.out.println(meuTituloOmdb);


        try{
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("aconteceu um erro");
            System.out.println(e.getMessage());
        }
        System.out.println(" O programa executou com sucesso");

    }
}
