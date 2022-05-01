package views;

import controllers.PlaylistController;
import models.Playlist;

public class ListarPlaylist {
    public void listar(){
        PlaylistController playlistController = new PlaylistController();      
        System.out.println("\n -- Suas playlists: -- \n");
        for (Playlist playlistCadastrada : playlistController.listar()) {
            System.out.println(playlistCadastrada);
        }
    }
}
