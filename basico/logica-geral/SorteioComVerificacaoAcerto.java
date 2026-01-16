import java.util.Random;
import java.util.Scanner;

public class SorteioComVerificacaoAcerto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sorteado = random.nextInt(5) + 1;
        int numero = scanner.nextInt();

        if (numero == sorteado) {
            System.out.println("Acertou");
        } else {
            System.out.println("Errou");
        }

        scanner.close();
    }
}
