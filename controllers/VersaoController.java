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

    public Versao buscarPorNome(String nome){
        for (Versao versaoCadastrada : versoes) {
            if(versaoCadastrada.getMusica().toString().equals(nome)){
                return versaoCadastrada;
            }
        }
        return null;
    }

    public Versao remover(String nome){
        for (Versao versaoMusica : versoes){
            if(versaoMusica.getMusica().toString().equals(nome)){
                versoes.remove(versaoMusica);
                return versaoMusica;
            }
        }
        return null;
    }

}
