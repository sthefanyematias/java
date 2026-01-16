import java.util.Scanner;

public class LeituraNumerosAteZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            System.out.println(numero);
        }

        scanner.close();
    }
}
