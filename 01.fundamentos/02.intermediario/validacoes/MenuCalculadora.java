import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            opcao = sc.nextInt();

            if (opcao == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);
            } else if (opcao == 2) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a - b);
            }
        } while (opcao != 0);

        sc.close();
    }
}
