import java.util.Random;
import java.util.Scanner;

public class SorteioNomeVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }

        int indice = random.nextInt(nomes.length);
        System.out.println(nomes[indice]);
        scanner.close();
    }
}
