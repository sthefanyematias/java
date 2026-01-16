import java.util.Scanner;

public class SenhaCorretaComTentativas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;

        do {
            senha = scanner.nextInt();
        } while (senha != 1234);

        System.out.println("Acesso permitido");
        scanner.close();
    }
}
