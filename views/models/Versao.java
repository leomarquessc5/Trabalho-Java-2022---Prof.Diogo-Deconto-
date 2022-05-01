package models;

public class Versao {

    private Musica musica;
    private Artista interprete;
    private String nomeVersao;

    public String getNomeVersao() {
        return nomeVersao;
    }
    public void setNomeVersao(String nomeVersao) {
        this.nomeVersao = nomeVersao;
    }
    public Musica getMusica() {
        return musica;
    }
    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    public Artista getInterprete() {
        return interprete;
    }
    public void setInterprete(Artista interprete) {
        this.interprete = interprete;
    }

    @Override public String toString(){
        return "Música: " + musica + "Artista: " + interprete;
    }
    
}
