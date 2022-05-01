package views;
import utils.Console;
import views.viewArtista.CadastrarArtista;
import views.viewArtista.ListarArtista;
import views.viewArtista.RemoverArtista;
import views.viewLogin.CriarLogin;
import views.viewMusicas.CadastrarMusica;
import views.viewMusicas.ListarMusicas;
import views.viewMusicas.RemoverMusica;
import views.viewPlaylist.AdicionarPlaylist;
import views.viewPlaylist.CadastrarPlaylist;
import views.viewPlaylist.ExcluirPlaylist;
import views.viewPlaylist.ListarPlaylist;
import views.viewVersao.CadastrarVersao;
import views.viewVersao.ListarVersao;
import views.viewVersao.RemoverVersao;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0, opcaoAdm= 0, opcaoUser=0;

        do{
            System.out.println("\n -- SOUND APLICATION -- \n");
            System.out.println("1 - Login administrador");
            System.out.println("2 - Login usuário");
            System.out.println("0 - Sair");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao){
                case 1:
                    do {
                        System.out.println("\n -- ADMIN LOGIN -- \n");
                        System.out.println("1 - Cadastrar música");
                        System.out.println("2 - Listar música");
                        System.out.println("3 - Remover música");
                        System.out.println("4 - Cadastrar artista");
                        System.out.println("5 - Listar artista");
                        System.out.println("6 - Remover artista");
                        System.out.println("7 - Cadastrar Canções À biblioteca de música");
                        System.out.println("8 - Exibir Biblioteca");
                        System.out.println("9 - Editar Biblioteca");
                        System.out.println("0 - Voltar\n");
                        
                        opcaoAdm = Console.readInt("Digite uma opção: ");

                        switch (opcaoAdm) {
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
                            case 0:
                                System.out.println("\n -- SAINDO -- \n");
                                break;
                            default:
                                System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                                break;
                        }

                    } while (opcaoAdm != 0);

                case 2: 
                    do {
                        System.out.println("\n -- USER LOGIN -- \n");
                        System.out.println("1 - Cadastrar login");
                        // System.out.println("2 - Listar login");
                        System.out.println("2 - Criar playlist");
                        System.out.println("3 - Adicionar músicas à uma playlist");
                        System.out.println("5 - Listar playlist");
                        System.out.println("6 - Remover playlist");
                        System.out.println("7 - Listar todas as playslists");
                        System.out.println("0 - Voltar\n");
                        
                        opcaoUser = Console.readInt("Digite uma opção: ");

                        switch (opcaoUser) {
                            case 1:
                                CriarLogin criarLogin= new CriarLogin();
                                criarLogin.compilar();
                                break;

                            // case 2:
                            //     ListarUsuario listarUsuario = new ListarUsuario();
                            //     listarUsuario.listar();
                            //     break;

                            // case 3:
                            //     ExcluirLogin excluirLogin= new ExcluirLogin();
                            //     excluirLogin.excluirLogin();
                            //     break;

                            case 2:
                                CadastrarPlaylist cadastrarPlaylist = new CadastrarPlaylist();
                                cadastrarPlaylist.cadastrar();
                                break;
                            case 3:
                                AdicionarPlaylist adicionarPlaylist = new AdicionarPlaylist();
                                adicionarPlaylist.adicionar();
                                break;
                            case 5:
                                ListarPlaylist listarPlaylist = new ListarPlaylist();
                                listarPlaylist.listar();
                                break;

                            case 6:
                                ExcluirPlaylist excluirPlaylist = new ExcluirPlaylist();
                                excluirPlaylist.remover();
                                break;
                            case 0:
                                System.out.println("\n -- SAINDO -- \n");
                                break;

                            default:
                                System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                                break;
                        }

                    } while (opcaoUser != 0);

                    
                default:
                System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                break;
            }
        }while (opcao != 0);
    }
}