import java.util.Scanner;

public class MaiorEMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = scanner.nextInt();
        int menor = maior;

        for (int i = 0; i < 4; i++) {
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println(maior);
        System.out.println(menor);
        scanner.close();
    }
}
