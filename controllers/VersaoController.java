package controllers;
import java.util.ArrayList;
import models.Versao;

public class VersaoController {

    private static ArrayList<Versao> versoes = new ArrayList<Versao>();

    public boolean cadastrar(Versao versao){
        if(buscarPorNome(versao.getNome())==null){
            versoes.add(versao);
            return true;
        }
        return false;
    }
    public ArrayList<Versao> listar(){
        return versoes;
    }

    public static Versao buscarPorNome(String nome){
        for (Versao versaoCadastrada : versoes) {
            if(versaoCadastrada.getNome().equals(nome)){
                return versaoCadastrada;
            }
        }
        return null;
    }

    public Versao remover(String abc){
        
        for (Versao versaoCadastrada : versoes){
            if(versaoCadastrada.getNome().equals(abc)){
                versoes.remove(versaoCadastrada);
                return versaoCadastrada;
            }
        }
        return null;
    }

}
