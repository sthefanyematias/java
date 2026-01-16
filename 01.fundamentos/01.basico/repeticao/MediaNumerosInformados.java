import java.util.Scanner;

public class MediaNumerosInformados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        double soma = 0;

        while (true) {
            double numero = scanner.nextDouble();
            if (numero < 0) {
                break;
            }
            soma += numero;
            quantidade++;
        }

        if (quantidade > 0) {
            System.out.println(soma / quantidade);
        }

        scanner.close();
    }
}
