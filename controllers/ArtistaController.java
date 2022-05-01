package controllers;

import java.util.ArrayList;

import models.Artista;

public class ArtistaController {
    private static ArrayList<Artista> artistas = new ArrayList<Artista>();

    public void cadastrar(Artista artista){
        artistas.add(artista);
    }
    
    public ArrayList<Artista> listar(){
        return artistas;
    }

    public Artista buscarPorNome(String nome){
        for (Artista artistaCadastrado : artistas) {
            if(artistaCadastrado.getArtista().equals(nome)){
                return artistaCadastrado;
            }
            return null;
        }
        return null;
    }
    
    public Artista remover(String nome){

        for (Artista artistaCadastrado : artistas) {
            if(artistaCadastrado.getArtista().equals(nome)){
                artistas.remove(artistaCadastrado);
                return artistaCadastrado;
            }
            return null;
        }
        return null;
    }

}
    

