import java.util.Scanner;

public class MediaAteNumeroNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;

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
