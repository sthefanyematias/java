import java.util.Scanner;

public class VerificaNumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println(numero > 0);
        System.out.println(numero < 0);
        System.out.println(numero == 0);
        scanner.close();
    }
}
