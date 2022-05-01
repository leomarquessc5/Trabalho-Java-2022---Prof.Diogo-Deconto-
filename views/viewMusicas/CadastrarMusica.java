package views.viewMusicas;
import controllers.MusicaController;
import models.Musica;
import utils.Console;

public class CadastrarMusica {

    public void compilar(){
        Musica musica = new Musica();        
        MusicaController musicaController = new MusicaController();
        System.out.println("\n -- CADASTRO DE MÚSICAS -- \n");
        musica.setNome(Console.readString("Digite o nome da música: "));
        musica.setDuracao(Console.readDouble("Digite a duração da música: "));
        musica.setCompositor(Console.readString("Digite o nome do compositor: "));
        musicaController.cadastrar(musica);
        System.out.println("\nMúsica cadastrada com sucesso !!!");
    }
    
}
