package models;

public class Artista {

    private String artista;
    private String genero;
    
    
    public String getArtista() {
        return artista;
    }
    
    public void setArtista(String artistaNome) {
        this.artista = artistaNome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return

        " | Artista : " + artista + " | Gênero: " + genero;
    
    }
}