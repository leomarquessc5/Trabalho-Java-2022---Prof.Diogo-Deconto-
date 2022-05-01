package controllers;
import models.MusicasPlaylis;
import java.util.ArrayList;

public class MusicasPlaylisController {

    private static ArrayList<MusicasPlaylis> adcMusica = new ArrayList<MusicasPlaylis>();

    public void adicionar (MusicasPlaylis listaMusicas){
        adcMusica.add(listaMusicas);
    }
    
    public MusicasPlaylis bucar(String nome){
        for (MusicasPlaylis listaMusicasCadastradas : adcMusica) {
            if(listaMusicasCadastradas.getNome().toString().equals(nome)){
                return listaMusicasCadastradas;
            }
        }
        return null;
    }

    public MusicasPlaylis remover(String nome){
       
        for (MusicasPlaylis musicasPlaylis : adcMusica) {
            if(musicasPlaylis.getNome().toString().equals(nome)){
                adcMusica.remove(musicasPlaylis);
                return musicasPlaylis;
            }
        }
        return null;
    }
}
