package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica("I Wanna Be Yours","AM", "Artic Monkeys","Indie Rock");
        minhaMusica.curtir();
        minhaMusica.curtir(50);
        minhaMusica.reproduzir();
        minhaMusica.reproduzir(1000);

        System.out.println("\nNome da música: " + minhaMusica.getTitulo());
        System.out.println("Artista: " + minhaMusica.getArtista());
        System.out.println("Album: " + minhaMusica.getAlbum());
        System.out.println("Genero Musical: " + minhaMusica.getGeneroMusical());
        System.out.println("Reproduções: " + minhaMusica.getTotReproducoes());
        System.out.println("Curtidas: " + minhaMusica.getTotCurtidas());
        System.out.println("Classificação: " + minhaMusica.getClassificacao());

        Podcast podcast = new Podcast("Flow Podcast", "Igor","PodCast precrusor do modelo de Video Podcast");
        podcast.curtir(360);
        podcast.reproduzir(10000);

        System.out.println("\nNome do Podcast: " + podcast.getTitulo());
        System.out.println("Host: " + podcast.getHost());
        System.out.println("Descrição: " + podcast.getDescricao());
        System.out.println("Reproduções: " + podcast.getTotReproducoes());
        System.out.println("Curtidas: " + podcast.getTotCurtidas());
        System.out.println("Classificação: " + podcast.getClassificacao());
    }
}