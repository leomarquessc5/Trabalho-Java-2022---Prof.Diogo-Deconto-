package models;

public class MusicasPlaylis {

    private Musica nome;

    public Musica getNome() {
        return nome;
    }

    public void setNome(Musica nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Música: " + nome.getNome();
    }
    
}
