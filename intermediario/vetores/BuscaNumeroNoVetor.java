import java.util.Scanner;

public class BuscaNumeroNoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int busca = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                encontrado = true;
            }
        }

        System.out.println(encontrado);
        scanner.close();
    }
}
