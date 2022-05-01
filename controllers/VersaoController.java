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

    public Versao remover(String abc){

        for (Versao versaoCadastrada : versoes){
            if(versaoCadastrada.getMusica().toString().equals(abc)){
                versoes.remove(versaoCadastrada);
                return versaoCadastrada;
            
            }
            
        }
        return null;
    }
    
}
