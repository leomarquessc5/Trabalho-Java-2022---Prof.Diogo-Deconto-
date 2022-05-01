package views;
import utils.Console;

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
                        System.out.println("\n -- Opções administradores -- \n");
                        System.out.println("1 - Cadastrar música");
                        System.out.println("2 - Listar música");
                        System.out.println("3 - Remover música");
                        System.out.println("4 - Cadastrar artista");
                        System.out.println("5 - Listar artista");
                        System.out.println("6 - Remover artista");
                        System.out.println("7 - Cadastrar versões");
                        System.out.println("8 - Listar versões");
                        System.out.println("9 - Remover versões");
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
                            default:
                                System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                                break;
                        }

                    } while (opcaoAdm != 0);

                case 2: 
                    do {
                        System.out.println("\n -- Opções usuário -- \n");
                        System.out.println("1 - Cadastrar login");
                        System.out.println("2 - Listar login");
                        System.out.println("3 - Remover login");
                        System.out.println("4 - Criar playlist");
                        System.out.println("5 - Listar playlist");
                        System.out.println("6 - Remover playlist");
                        System.out.println("7 - Listar todas as playslists");
                        System.out.println("8 - Adicionar playlist a sua biblioteca");
                        System.out.println("9 - Biblioteca"); /*listar playlist atribuídas ao login, incluindo a de terceiros*/
                        System.out.println("0 - Voltar\n");
                        
                        opcaoUser = Console.readInt("Digite uma opção: ");

                        switch (opcaoUser) {
                            case 1:
                                CriarLogin criarLogin= new CriarLogin();
                                criarLogin.compilar();
                                break;

                            case 2:
                                ListarUsuario listarUsuario = new ListarUsuario();
                                listarUsuario.listar();
                                break;

                            case 3:
                                ExcluirLogin excluirLogin= new ExcluirLogin();
                                excluirLogin.excluirLogin();
                                break;

                            case 4:
                                CadastrarPlaylist cadastrarPlaylist = new CadastrarPlaylist();
                                cadastrarPlaylist.cadastrar();
                                break;
                            
                            case 5:
                                ListarPlaylist listarPlaylist = new ListarPlaylist();
                                listarPlaylist.listar();
                                break;

                            case 6:
                                ExcluirPlaylist excluirPlaylist = new ExcluirPlaylist();
                                excluirPlaylist.remover();
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