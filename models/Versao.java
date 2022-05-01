package models;

public class Versao {

    private Musica musica;
    private Artista interprete;

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
        return "Música: " + musica.getNome() + interprete + " ";
    }
    
}
