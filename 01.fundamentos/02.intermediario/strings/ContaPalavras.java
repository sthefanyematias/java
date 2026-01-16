import java.util.Scanner;

public class ContaPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        String[] palavras = texto.split(" ");
        System.out.println(palavras.length);

        scanner.close();
    }
}
