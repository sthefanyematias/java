import java.util.Random;
import java.util.Scanner;

public class JogoParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int usuario = scanner.nextInt();
        int computador = random.nextInt(10) + 1;
        int soma = usuario + computador;

        if (soma % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        scanner.close();
    }
}
