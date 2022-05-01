package views;
import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do{
            System.out.println("\n -- PROJETO JAVA -- \n");
            System.out.println("1 - Cadastrar música");
            System.out.println("2 - Listar música");
            System.out.println("3 - Remover música");
            System.out.println("4 - Cadastrar artista");
            System.out.println("5 - Listar artista");
            System.out.println("6 - Remover artista");
            System.out.println("7 - Cadastrar versões");
            System.out.println("8 - Listar versões");
            System.out.println("9 - Remover versões");
            System.out.println("10 - Cadastrar login");
            System.out.println("11 - Listar login");
            System.out.println("12 - Remover login");
            System.out.println("13 - Criar playlist");
            System.out.println("14 - Listar playlist");
            System.out.println("15 - Remover playlist");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao){
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
                    ListarArtista listarArtistas = new ListarArtista();
                    listarArtistas.listar();
                    break;
                case 6:
                    RemoverArtista removerArtista = new RemoverArtista();
                    removerArtista.remover();
                    break;
                case 7:
                    CadastrarVersao cadastrarVersao = new CadastrarVersao();
                    cadastrarVersao.cadastrar();
                    break;
                case 8:
                    ListarVersao listarVersao = new ListarVersao();
                    listarVersao.listar();
                    break;
                case 9:
                    RemoverVersao removerVersao = new RemoverVersao();
                    removerVersao.remover();
                    break;
                case 10:
                    CriarLogin criarLogin= new CriarLogin();
                    criarLogin.compilar();
                    break;

                case 11:
                    ListarUsuario listarUsuario = new ListarUsuario();
                    listarUsuario.listar();
                    break;

                case 12:
                    ExcluirLogin excluirLogin= new ExcluirLogin();
                    excluirLogin.excluirLogin();
                    break;

                case 13:
                    CadastrarPlaylist cadastrarPlaylist = new CadastrarPlaylist();
                    cadastrarPlaylist.cadastrar();
                    break;
                
                case 14:
                    ListarPlaylist listarPlaylist = new ListarPlaylist();
                    listarPlaylist.listar();
                    break;

                case 15:
                    ExcluirPlaylist excluirPlaylist = new ExcluirPlaylist();
                    excluirPlaylist.remover();
                    break;

                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }
        }while (opcao != 0);
    }
}