package models;

public class Playlist {

    private String nome;
    private Login usuario;
    private Versao versao;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Login getUsuario() {
        return usuario;
    }
    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }
    public Versao getVersao() {
        return versao;
    }
    public void setVersao(Versao versao) {
        this.versao = versao;
    }

    
    
}
