package views;

import licaoaula.util.Console;
import models.Artista;
import models.Musica;
import models.Versao;
import controllers.ArtistaController;
import controllers.MusicaController;
import controllers.VersaoController;

public class CadastrarVersao {
    public void cadastrar() {
        
        Versao versao = new Versao ();
        VersaoController versaoController = new VersaoController();
        MusicaController musicaController = new MusicaController();
        ArtistaController artistaController = new ArtistaController();

        System.out.println("\n -- RELACIONAR VERSÃO DA MÚSICA AO ARTISTA: -- \n");

        String versaoMusica = Console.readString("Digite o nome da Música: ");
        Musica musica = musicaController.buscarPorNome(versaoMusica);

        if (musica != null){
            versao.setMusica(musica);

            String interprete = Console.readString("Informe o artista que quer relacionar a musica: ");
            Artista artista = artistaController.buscarPorNome(interprete);
            if (artista != null){
                versao.setInterprete(artista);
                versaoController.cadastrar(versao);
                System.out.println("Versão Cadastrada!");
            }else{
                System.out.println("Artista Não Encontrado");
            }
        }
        else
        {
            System.out.println("Música não Encontrada!");
        }
    }
}