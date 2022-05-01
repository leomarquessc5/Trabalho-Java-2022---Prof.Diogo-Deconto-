package views;

import controllers.VersaoController;
import models.Versao;

public class ListarVersoes {
    
    public void listar() {
        VersaoController versaoController = new VersaoController();
        System.out.println("\n CANÇÕES: \n");
        for(Versao cancoesCadastradas : versaoController.listar()){
            System.out.println(cancoesCadastradas);
        }
        
    }
}
