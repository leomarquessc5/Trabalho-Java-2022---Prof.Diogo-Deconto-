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
            return null;
        }
        return null;
    }

    public Musica remover(String nomeMusica){
       
        for (Musica musicaCadastrada : musicas) {
            if(musicaCadastrada.getNome().equals(nomeMusica)){
                musicas.remove(musicaCadastrada);
                return musicaCadastrada;
            }
            return null;
        }
        return null;
    }

    /* 
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("C");
    list.add("B");
    list.add("A");
    System.out.println(list);

    boolean isRemoved = list.remove("C");
    System.out.println(list);
    System.out.println(isRemoved);

    isRemoved = list.remove("X");
    System.out.println(list);
    System.out.println(isRemoved);
    */
}
