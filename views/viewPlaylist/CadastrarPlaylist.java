package views.viewPlaylist;

import models.Playlist;
import models.Login;
import models.Versao;
import controllers.PlaylistController;
import controllers.VersaoController;
import controllers.LoginController;
// import controllers.VersaoController;
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
            playlist.setLogin(usuario);
            playlistController.cadastrar(playlist);

            
            int contador = 0;

            do { 
                System.out.println("-- CADASTRO PLAYLIST -- \n\n");
                System.out.println("1 - Adicionar mais uma música");
                System.out.println("0 - Finalizar playlist");
                contador= Console.readInt("Digite a opção: ");

                switch (contador) {

                    case 1: 
                        String nomeMusica= Console.readString("Digite a Música: ");
                        Versao versao = VersaoController.buscarPorNome(nomeMusica);
                        
                        if(versao != null){
                                playlist.setItemMusica(versao);
                                System.out.println("Musica adicionada.");
                                }
                            playlistController.cadastrar(playlist);
                        break;

                    case 0:
                            System.out.println("\n SAIR \n");
                            break;

                    default:
                        System.out.println("\n -- -- \n");
                        break;
                
                            
            } 

            }while (contador != 0);

        
        }else{
            System.out.println("Usuário não encontrado!");
        }
    
    }
}