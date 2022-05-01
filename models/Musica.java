package models;

public class Musica {
    
    private String nome;
    private double duracao;
    private String compositor;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return 
            "Nome: " + nome + 
            " | Duração: " + duracao +
            " | Compositor: " + compositor;
    }
    
}
