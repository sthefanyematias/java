import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumeroSorteado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sorteado = random.nextInt(10) + 1;
        int tentativa;

        do {
            tentativa = scanner.nextInt();
        } while (tentativa != sorteado);

        System.out.println("Acertou");
        scanner.close();
    }
}
