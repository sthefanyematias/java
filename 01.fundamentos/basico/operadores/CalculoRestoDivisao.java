import java.util.Scanner;

public class CalculoRestoDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Resto: " + (a % b));
        scanner.close();
    }
}
