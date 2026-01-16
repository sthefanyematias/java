import java.util.Scanner;

public class SomaElementosVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println(soma);
        scanner.close();
    }
}
