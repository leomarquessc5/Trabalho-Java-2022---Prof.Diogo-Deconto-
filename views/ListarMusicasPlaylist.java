package views;
import models.MusicasPlaylis;
import controllers.MusicasPlaylisController;

public class ListarMusicasPlaylist {
    public void compilar(){
        MusicasPlaylisController musicasPlaylisController = new MusicasPlaylisController();      
        for (MusicasPlaylisController musicasPlaylis : musicasPlaylisController.listar()) {
            System.out.println(musicasPlaylis);
        }
    }
}
