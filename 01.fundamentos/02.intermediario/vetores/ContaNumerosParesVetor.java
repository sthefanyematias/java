import java.util.Scanner;

public class ContaNumerosParesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println(pares);
        scanner.close();
    }
}
