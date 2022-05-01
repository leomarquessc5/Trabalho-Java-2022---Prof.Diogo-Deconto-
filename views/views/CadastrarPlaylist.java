package views;
import models.Playlist;
import models.Login;
import models.Versao;
import controllers.PlaylistController;
import controllers.LoginController;
import controllers.VersaoController;
import utils.Console;

public class CadastrarPlaylist {

    public void cadastrar() {

        Playlist playlist = new Playlist();     
        VersaoController versaoController = new VersaoController();
        PlaylistController playlistController = new PlaylistController();
        LoginController loginController = new LoginController();

        System.out.println("\n -- CRIAÇÃO DE PLAYLISTS -- \n");

        playlist.setNome(Console.readString("Digite o nome da playlist: "));

        String criador = Console.readString("Informe o nome do usuário: ");
        Login usuario = loginController.listar(criador);


        if(usuario != null){
            playlist.setCriador(usuario);

            String nomeversao= Console.readString("Digite o nome da versão: ");
            Versao versao= versaoController.buscarPorNome(nomeversao);
    

            if(versao != null){
                playlist.setCriador(usuario);
                playlistController.cadastrar(playlist);
                System.out.println("Playlist cadastrada.");
            }
            else{
                System.out.println("Usuário não encontrado.");
            }
        }

        else{
            System.out.println("Versão não cadastrada.");
        }

        
    }
    
}