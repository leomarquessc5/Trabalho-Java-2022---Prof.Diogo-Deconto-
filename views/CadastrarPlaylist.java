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

            
            int contador = 0;

            do { 
                System.out.println("Inserir Musicas:");
                System.out.println("1 para inserir, 0 para parar");

                switch (contador) {

                    case 1: 

                        String nomeMusica= Console.readString("Digite a Música: ");
                        Versao versao = versaoController.buscarPorNome(nomeMusica);
                        
                        if(versao != null){
                            playlist.setMusica(versao);
                            playlistController.cadastrar(playlist);
                            System.out.println("Musica adicionada.");
                            }
                        playlistController.cadastrar(playlist);
                    break;
                    case 2:
                        System.out.println("\n -- SAINDO -- \n");
                        break;
                    case 0:
                            System.out.println("ok");
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