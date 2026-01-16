import java.util.Scanner;

public class MenuSimplesRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            opcao = scanner.nextInt();
        } while (opcao != 0);

        scanner.close();
    }
}
