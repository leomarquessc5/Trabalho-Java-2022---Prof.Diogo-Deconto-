package views;
import models.Playlist;
import models.Login;
import models.Versao;
import controllers.PlaylistController;
import controllers.LoginController;
import controllers.VersaoController;
import utils.Console;

public class CadastrarPlaylist {

    public void compilar() {

        Playlist playlist = new Playlist();     
        VersaoController versaoController = new VersaoController();
        PlaylistController playlistController = new PlaylistController();
        LoginController loginController = new LoginController();
        
        System.out.println("\n -- CRIAÇÃO DE PLAYLISTS -- \n");
        playlist.setNome(Console.readString("Nome da playlist: "));
        playlist.setUsuario(Console.readString("Usuario: "));
        playlist.setVersao(Console.readString("Versão da música: "));
        playlistController.cadastrar(playlist);
        System.out.println("\n Playlist criada.");

        
    }
    
}