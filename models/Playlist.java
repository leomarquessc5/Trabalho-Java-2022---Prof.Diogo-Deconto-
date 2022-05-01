package models;

public class Playlist {

    private String nome;
    private Login criador;
    private Versao musica;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Login getCriador() {
        return criador;
    }
    public void setCriador(Login criador) {
        this.criador = criador;
    }
    public Versao getMusica() {
        return musica;
    }
    public void setMusica(Versao musica) {
        this.musica = musica;
    }

}
