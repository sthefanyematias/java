import java.util.Scanner;

public class MenuComTratamentoErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Opcao 1");
            } else if (opcao == 2) {
                System.out.println("Opcao 2");
            } else {
                System.out.println("Opcao invalida");
            }
        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}
