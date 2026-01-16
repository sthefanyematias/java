import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        pessoas.add(new Pessoa(nome, idade));
                        break;

                    case 2:
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println(i + " - " + pessoas.get(i).nome + " " + pessoas.get(i).idade);
                        }
                        break;

                    case 3:
                        System.out.print("Indice: ");
                        int indice = sc.nextInt();
                        pessoas.remove(indice);
                        break;

                    case 4:
                        System.out.println("Encerrando");
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
