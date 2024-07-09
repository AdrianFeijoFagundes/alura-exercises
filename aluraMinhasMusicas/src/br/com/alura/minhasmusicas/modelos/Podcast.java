package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public Podcast(String titulo, String host, String descricao) {
        super(titulo);
        this.host = host;
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotCurtidas() > 100) {
            return 10;
        } else {
            return 8;
        }
    }
}
