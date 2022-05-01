package views.viewMusicasPlaylist;
import utils.Console;
import controllers.MusicasPlaylisController;

public class ExcluirMusicasPlaylis {

    public void excluir() {
        MusicasPlaylisController musicasPlaylisController = new MusicasPlaylisController();
        System.out.println("\n -- EXCLUIR LOGIN --");
        musicasPlaylisController.remover(Console.readString("Digite o nome do usuário de deseja excluir: "));
        System.out.println("\n Login excluído.");
    }
    
}
