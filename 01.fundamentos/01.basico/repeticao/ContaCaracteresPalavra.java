import java.util.Scanner;

public class ContaCaracteresPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        System.out.println(palavra.length());
        scanner.close();
    }
}
