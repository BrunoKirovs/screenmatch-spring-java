package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=26baf40b";

    public void exibeMenu(){

        System.out.println("Digite o nome da Série para busca: ");
        var nomeSerie = leitura.nextLine();
        //var consumoApi = new ConsumoApi();
        var json = consumo.obterDados(
                ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        //https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=26baf40b
    }
}
