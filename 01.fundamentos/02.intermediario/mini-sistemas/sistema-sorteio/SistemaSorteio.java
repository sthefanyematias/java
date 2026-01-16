import java.util.Scanner;
import java.util.Random;

public class SistemaSorteio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] nomes = new String[5];
        int total = 0;
        int opcao;

        do {
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (total < nomes.length) {
                        sc.nextLine();
                        nomes[total] = sc.nextLine();
                        total++;
                    }
                    break;

                case 2:
                    if (total > 0) {
                        int posicao = random.nextInt(total);
                        System.out.println(nomes[posicao]);
                    }
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
