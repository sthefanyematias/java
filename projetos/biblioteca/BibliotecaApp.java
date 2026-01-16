import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n1 - Adicionar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Alugar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("5 - Sair");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        b.adicionar(new Livro(titulo, autor));
                        break;
                    case 2:
                        b.listar();
                        break;
                    case 3:
                        System.out.print("Indice do livro: ");
                        int iAlugar = sc.nextInt();
                        b.alugar(iAlugar);
                        break;
                    case 4:
                        System.out.print("Indice do livro: ");
                        int iDevolver = sc.nextInt();
                        b.devolver(iDevolver);
                        break;
                    case 5:
                        System.out.println("Encerrando Biblioteca");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida");
                sc.nextLine();
            }
        }
    }
}
