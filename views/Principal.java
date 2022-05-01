package views;
import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- SOUND APLICATION -- \n");
            System.out.println("1 - Cadastrar Música");
            System.out.println("2 - Listar Músicas cadastradas");
            System.out.println("3 - Remover Música");
            System.out.println("4 - Cadastrar Artista");
            System.out.println("5 - Listar Artistas cadastrados");
            System.out.println("6 - Cadastrar versão de Música");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarMusica cadastrarMusica = new CadastrarMusica();
                    cadastrarMusica.compilar();
                    break;
                case 2:
                    ListarMusicas listarMusicas = new ListarMusicas();
                    listarMusicas.compilar();
                    break;
                case 3:
                     RemoverMusica removerMusica = new RemoverMusica();
                     removerMusica.remover();
                    break;
                case 4:
                    CadastrarArtista cadastrarArtista = new CadastrarArtista();
                    cadastrarArtista.compile();
                    break;
                case 5:
                    ListarArtistas listarArtistas = new ListarArtistas();
                    listarArtistas.listar();
                    break;
                case 6:
                    CadastrarVersao cadastrarVersao = new CadastrarVersao();
                    cadastrarVersao.cadastrar();
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}