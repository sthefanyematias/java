import java.util.Scanner;

public class SistemaCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int opcao;

        do {
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    double valor = sc.nextDouble();
                    total += valor;
                    break;

                case 2:
                    double desconto = sc.nextDouble();
                    total -= desconto;
                    break;

                case 3:
                    System.out.println(total);
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
