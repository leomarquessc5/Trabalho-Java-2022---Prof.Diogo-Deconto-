package views.viewMusicas;
import controllers.ArtistaController;
import controllers.MusicaController;
import views.viewArtista.CadastrarArtista;
import models.Musica;
import utils.Console;
import models.Artista;

public class CadastrarMusica {

    public void compilar(){
        
        ArtistaController artistaController = new ArtistaController();
        MusicaController musicaController = new MusicaController();

        System.out.println("\n -- CADASTRO DE MÚSICAS -- \n");
        String titulo, autor, interprete, genero;
        int opcao;
        double duracao;
        titulo = (Console.readString("Digite o nome da música: "));
        autor = (Console.readString("Digite o nome do compositor: "));
        duracao = (Console.readDouble("Digite a duração da música: "));
        interprete = (Console.readString("Digite o nome do artista: "));
        Artista artista = artistaController.buscarPorNome(interprete);
        if(artista == null){
            do {
                opcao = (Console.readInt("Artista inexistente. Digite 0 para cadastrar um Artista e 1 para buscar novamente: "));

                switch(opcao){
                    case 0 :
                        CadastrarArtista cadastrarArtista = new CadastrarArtista();
                        cadastrarArtista.compile();
                    break;
                    case 1:
                        interprete = (Console.readString("Artista inexistente digite novamente: "));
                        artista = artistaController.buscarPorNome(interprete);
                    break;
                    default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
                }
            } while (artista == null);
        }
        genero = (Console.readString("Informe o gênero: "));
        Musica musica = new Musica(titulo, autor, duracao, artista, genero);
        musicaController.cadastrar(musica);

        System.out.println("\nMúsica cadastrada com sucesso !!!");
    }
    
}
