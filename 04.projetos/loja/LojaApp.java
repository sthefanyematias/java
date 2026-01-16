import java.util.ArrayList;
import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new ProdutoFisico("Caderno", 20));
        produtos.add(new ProdutoDigital("E-book", 15));

        Cartao cartao = new Cartao(50);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n1 - Listar produtos");
            System.out.println("2 - Comprar produto");
            System.out.println("3 - Sair");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.print(i + " - ");
                            produtos.get(i).info();
                        }
                        break;
                    case 2:
                        System.out.print("Indice do produto: ");
                        int idx = sc.nextInt();
                        if (idx >= 0 && idx < produtos.size()) {
                            Produto p = produtos.get(idx);
                            if (cartao.pagar(p.preco)) {
                                System.out.println("Compra aprovada: " + p.nome);
                            } else {
                                System.out.println("Saldo insuficiente - compra negada");
                            }
                        } else {
                            System.out.println("Indice invalido");
                        }
                        break;
                    case 3:
                        System.out.println("Encerrando Loja");
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
