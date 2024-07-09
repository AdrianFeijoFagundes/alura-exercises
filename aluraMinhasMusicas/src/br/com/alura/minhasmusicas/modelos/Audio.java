package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totReproducoes;
    private int totCurtidas;
    private int classificacao;

    public Audio(String titulo) {
        this.titulo = titulo;
        this.totReproducoes = 0;
        this.totCurtidas = 0;
        this.classificacao = 0;
    }




    public void curtir() {
        this.totCurtidas++;
    }
    public void curtir(int likes) {
        this.totCurtidas += likes;
    }
    public void reproduzir() {
        this.totReproducoes++;
    }
    public void reproduzir(int reproducoes) {
        this.totReproducoes += reproducoes;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotReproducoes() {
        return totReproducoes;
    }

    public int getTotCurtidas() {
        return totCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
