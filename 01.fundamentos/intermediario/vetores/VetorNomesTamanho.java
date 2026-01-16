import java.util.Scanner;

public class VetorNomesTamanho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i].length());
        }

        scanner.close();
    }
}
