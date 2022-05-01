package models;

public class Versao {

    private Musica musica;
    private Artista interprete;
    private String nome;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
        return "Música: " + musica + "Artista: " + interprete + "Versão: " + nome;
    }
    
}
