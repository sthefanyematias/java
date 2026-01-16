import java.util.Scanner;

public class ContagemNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 != 0) {
                quantidade++;
            }
        }

        System.out.println(quantidade);
        scanner.close();
    }
}
