import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] numeros = {9, 4, 7, 2, 1, 8};

        ordenar(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    static void ordenar(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
