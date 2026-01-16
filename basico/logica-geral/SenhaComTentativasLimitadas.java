import java.util.Scanner;

public class SenhaComTentativasLimitadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int senha;

        while (tentativas < 3) {
            senha = scanner.nextInt();
            if (senha == 123) {
                System.out.println("Acesso permitido");
                break;
            }
            tentativas++;
        }

        scanner.close();
    }
}
