import java.util.Scanner;

public class ContaOcorrenciasNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int valor = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                contador++;
            }
        }

        System.out.println(contador);
        scanner.close();
    }
}
