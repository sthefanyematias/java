import java.util.Scanner;

public class ContadorParesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int total = contarPares(numeros);
        System.out.println(total);

        scanner.close();
    }

    static int contarPares(int[] vetor) {
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }
}
