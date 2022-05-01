package views;

import controllers.ArtistaController;
import models.Artista;

public class ListarArtistas {
    public void listar() {
        ArtistaController artistaController = new ArtistaController();
        System.out.println("\n -- LISTAGEM DE ARTISTAS -- \n");        
        for(Artista artistasCadastrados : artistaController.listar()){
            System.out.println(artistasCadastrados);
        }
    }
}
