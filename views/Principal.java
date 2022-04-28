package views;
import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- SOUND APLICATION -- \n");
            System.out.println("1 - Cadastrar Música");
            System.out.println("2 - Listar Música");
            System.out.println("3 - Remover Música");
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
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}