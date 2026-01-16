import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c = new Conta("Sthefany", 500);
        Cartao cartao = new Cartao(c);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n1 - Consultar saldo");
            System.out.println("2 - Fazer compra");
            System.out.println("3 - Sair");

            try {
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo: " + c.saldo);
                        break;
                    case 2:
                        System.out.print("Valor da compra: ");
                        double valor = sc.nextDouble();
                        if (cartao.pagar(valor)) {
                            System.out.println("Compra aprovada");
                        } else {
                            System.out.println("Saldo insuficiente - compra negada");
                        }
                        break;
                    case 3:
                        System.out.println("Encerrando sistema");
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
