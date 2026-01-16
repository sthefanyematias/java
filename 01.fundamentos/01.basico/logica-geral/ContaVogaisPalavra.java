import java.util.Scanner;

public class ContaVogaisPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine().toLowerCase();
        int vogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }

        System.out.println(vogais);
        scanner.close();
    }
}
