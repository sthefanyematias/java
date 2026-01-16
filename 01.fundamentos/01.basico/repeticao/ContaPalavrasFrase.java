import java.util.Scanner;

public class ContaPalavrasFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        String[] palavras = frase.split(" ");
        System.out.println(palavras.length);
        scanner.close();
    }
}
