import java.util.Scanner;

public class SomaNumerosAteLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= limite; i++) {
            soma += i;
        }

        System.out.println(soma);
        scanner.close();
    }
}
