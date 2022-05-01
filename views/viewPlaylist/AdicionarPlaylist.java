package views.viewPlaylist;

// import controllers.MusicaController;
import controllers.PlaylistController;
import controllers.VersaoController;
// import models.Musica;
import models.Playlist;
import models.Versao;
import utils.Console;

public class AdicionarPlaylist {

    public void adicionar(){

        String nomeador;

        Playlist playlist = new Playlist();
        VersaoController versaoController = new VersaoController();
        PlaylistController playlistController = new PlaylistController();
        // MusicaController musicaController = new MusicaController();

        System.out.println("\n ADICIONAR MÚSICAS: \n");

        nomeador = Console.readString("Digite a playlist existente: ");

        String nomePlaylist = nomeador;
        playlist.setNome(nomeador);

        playlistController.buscarPlaylist(nomePlaylist);

        playlist.setPlaylist(playlist);
        
        String nomeMusica= Console.readString("Digite a Música: ");
        Versao versao = versaoController.buscarPorNome(nomeMusica);
                    
        if(versao != null)
        {
            playlist.setMusica(versao);
            playlistController.cadastrar(playlist);
            System.out.println("Musica adicionada.");
        }
        // String novoItem = Console.readString("Adicione uma musica existente: ");
        // Versao versao = versaoController.buscarPorNome(novoItem);

        // if (versao != null)
        // {
        //     playlist.setMusica(versao);

        //     System.out.println("Música Adicionada!");
        // }
        else
        {
            System.out.println("Música não encontrada!");
        }
    }

}
