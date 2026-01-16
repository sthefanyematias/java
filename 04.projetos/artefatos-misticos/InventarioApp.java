import java.util.Scanner;

public class InventarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inv = new Inventario();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n1 - Adicionar artefato");
            System.out.println("2 - Listar artefatos");
            System.out.println("3 - Somar poderes");
            System.out.println("4 - Buscar artefato por nome");
            System.out.println("5 - Sair");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do artefato: ");
                        String nome = sc.nextLine();
                        System.out.print("Poder: ");
                        int poder = sc.nextInt();
                        inv.adicionar(new Artefato(nome, poder));
                        break;
                    case 2:
                        inv.listar();
                        break;
                    case 3:
                        System.out.println("Soma dos poderes: " + inv.somaPoderes());
                        break;
                    case 4:
                        System.out.print("Nome do artefato: ");
                        String busca = sc.nextLine();
                        Artefato a = inv.buscarPorNome(busca);
                        if (a != null) {
                            System.out.println("Encontrado: " + a.nome + " - Poder: " + a.poder);
                        } else {
                            System.out.println("Artefato nao encontrado");
                        }
                        break;
                    case 5:
                        System.out.println("Encerrando inventario");
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
