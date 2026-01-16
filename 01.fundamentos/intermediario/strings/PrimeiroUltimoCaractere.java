import java.util.Scanner;

public class PrimeiroUltimoCaractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        char primeiro = texto.charAt(0);
        char ultimo = texto.charAt(texto.length() - 1);

        System.out.println(primeiro);
        System.out.println(ultimo);
        scanner.close();
    }
}
