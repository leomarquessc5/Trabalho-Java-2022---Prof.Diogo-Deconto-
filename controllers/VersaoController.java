package controllers;

import java.util.ArrayList;

import models.Versao;

public class VersaoController {

    private static ArrayList<Versao> versoes = new ArrayList<Versao>();

    public void cadastrar(Versao versao){
        versoes.add(versao);
    }
    public ArrayList<Versao> listar(){
        return versoes;
    }

    // public Versao remover(String nome){

    //     for (Versao versaoMusica : versoes){
    //         if(versaoMusica.getMusica().equals(nome)){
    //             versoes.remove(versaoMusica);
    //             return versaoMusica;
            
    //         }
    //         return null;
    //     }
    //     return null;
    // }
    
    // public Versao remover(String versaoRemover){
    //     for(Versao versaoCadastrada : versoes){
    //         if(versaoCadastrada.getMusica().equals(versaoRemover)){
    //             versoes.remove(versaoCadastrada);
    //             return versaoCadastrada;
    //         }
    //         return null;
    //     }
    //     return null;
    // }


}
