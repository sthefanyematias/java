import java.util.Scanner;

public class BuscaValorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        int valor = scanner.nextInt();
        boolean encontrado = buscar(valor, valores);

        System.out.println(encontrado);
        scanner.close();
    }

    static boolean buscar(int valor, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
