package views.viewVersao;
import controllers.VersaoController;
import models.Versao;

public class ListarVersao {
    
    public void listar() {
        VersaoController versaoController = new VersaoController();
        System.out.println("\n CANÇÕES: \n");
        for(Versao versaoCadastrada : versaoController.listar()){
            System.out.println(versaoCadastrada);
        }
        
    }
}
