package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
        private String album;
        private String artista;
        private String generoMusical;

    public Musica(String titulo, String album, String artista, String generoMusical) {
        super(titulo);
        this.album = album;
        this.artista = artista;
        this.generoMusical = generoMusical;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotReproducoes() > 1000) {
            return 10;
        } else {
            return 8;
        }
    }
}
