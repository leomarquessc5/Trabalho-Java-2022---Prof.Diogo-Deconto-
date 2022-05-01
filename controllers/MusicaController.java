package controllers;
import java.util.ArrayList;
import models.Musica;

public class MusicaController {

    private static ArrayList<Musica> musicas = new ArrayList<Musica>();

    public void cadastrar(Musica musica) {
        musicas.add(musica);
    }

    public ArrayList<Musica> listar() {
        return musicas;
    }

    public Musica buscarPorNome(String nome){
        for (Musica musicaCadastrada : musicas) {
            if(musicaCadastrada.getNome().equals(nome)){
                return musicaCadastrada;
            }
        }
        return null;
    }

    public Musica remover(String nome){
       
        for (Musica musicaCadastrada : musicas) {
            if(musicaCadastrada.getNome().equals(nome)){
                musicas.remove(musicaCadastrada);
                return musicaCadastrada;
            }
        }
        return null;
    }
}
