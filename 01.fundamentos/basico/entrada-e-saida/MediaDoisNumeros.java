import java.util.Scanner;

public class MediaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double media = (a + b) / 2;
        System.out.println("Media: " + media);
        scanner.close();
    }
}
