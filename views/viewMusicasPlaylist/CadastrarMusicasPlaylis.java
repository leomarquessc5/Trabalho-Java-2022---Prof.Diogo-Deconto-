package views.viewMusicasPlaylist;
import utils.Console;
import controllers.MusicasPlaylisController;
import models.MusicasPlaylis;

public class CadastrarMusicasPlaylis {

    public void compilar(){
        
        MusicasPlaylis musicasPlaylis = new MusicasPlaylis();        
        MusicasPlaylisController musicasPlaylisController = new MusicasPlaylisController();

        System.out.println("\n -- CADASTRO DE MÚSICAS -- \n");
        
        String titulo= Console.readString("Digite a Música: ");
        MusicasPlaylis nome = musicasPlaylisController.listar(titulo);
        
        if(nome != null){
            musicasPlaylis.setNome(nome);
            musicasPlaylisController.adicionar(musicasPlaylis);
            System.out.println("Musica adicionada.");
            }
        else
        {
            System.out.println("Música não Encontrada!");
        }  
}
