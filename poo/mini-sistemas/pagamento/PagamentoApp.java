import java.util.Scanner;

public class PagamentoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pagamento pagamento = null;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Cartao");
            System.out.println("2 - Pix");
            System.out.println("3 - Boleto");
            System.out.println("4 - Sair");

            try {
                opcao = sc.nextInt();

                if (opcao == 4) {
                    break;
                }

                System.out.print("Valor: ");
                double valor = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        pagamento = new Cartao(300);
                        break;
                    case 2:
                        pagamento = new Pix();
                        break;
                    case 3:
                        pagamento = new Boleto();
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        continue;
                }

                if (pagamento.pagar(valor)) {
                    System.out.println("Pagamento aprovado");
                } else {
                    System.out.println("Pagamento negado");
                }

            } catch (Exception e) {
                System.out.println("Erro de entrada");
                sc.nextLine();
            }
        }
    }
}
