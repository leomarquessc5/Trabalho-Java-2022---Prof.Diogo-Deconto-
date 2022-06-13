package models;
import java.util.ArrayList;

public class Playlist {

    public Playlist(){
        login = new Login();
        itemMusica = new ArrayList<Versao>();
    }

    private String nome;
    private Login login;
    private ArrayList<Versao> itemMusica;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public ArrayList<Versao> getItemMusica() {
		return itemMusica;
	}
	public void setItemMusica(ArrayList<Versao> itemMusica) {
		this.itemMusica = itemMusica;
	}

    // private String nome;
    // private Login criador;
    // private Versao musica;

    // private Playlist playlist;
    // public Playlist getPlaylist() {
    //     return playlist;
    // }
    // public void setPlaylist(Playlist playlist) {
    //     this.playlist = playlist;
    // }
    
    // public String getNome() {
    //     return nome;
    // }
    // public void setNome(String nome) {
    //     this.nome = nome;
    // }
    // public Login getCriador() {
    //     return criador;
    // }
    // public void setCriador(Login criador) {
    //     this.criador = criador;
    // }
    // public Versao getMusica() {
    //     return musica;
    // }
    // public void setMusica(Versao musica) {
    //     this.musica = musica;
    // }

    @Override
    public String toString() {
        return " || Playlist : " + nome + login.getUsuario() + " || Musica: " + itemMusica + " || ";
    }

}
