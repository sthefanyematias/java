import java.util.Scanner;

public class TamanhoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        System.out.println(texto.length());
        scanner.close();
    }
}
