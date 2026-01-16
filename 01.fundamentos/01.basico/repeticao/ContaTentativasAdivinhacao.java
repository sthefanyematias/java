import java.util.Random;
import java.util.Scanner;

public class ContaTentativasAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sorteado = random.nextInt(10) + 1;
        int tentativa;
        int tentativas = 0;

        do {
            tentativa = scanner.nextInt();
            tentativas++;
        } while (tentativa != sorteado);

        System.out.println(tentativas);
        scanner.close();
    }
}
