import java.util.Scanner;

public class ExibeCaracteresUmPorLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }

        scanner.close();
    }
}
