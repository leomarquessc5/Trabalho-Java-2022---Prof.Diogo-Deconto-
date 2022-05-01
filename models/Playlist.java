package models;

public class Playlist {

    private String nome;
    private Login criador;
    private Versao musica;

    private Playlist playlist;
    public Playlist getPlaylist() {
        return playlist;
    }
    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
    
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

    @Override
    public String toString() {
        return " || Playlist : " + playlist + criador + " || Musica: " + musica + " || ";
    }

}
