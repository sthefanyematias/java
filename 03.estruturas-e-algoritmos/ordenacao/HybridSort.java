import java.util.Arrays;

public class HybridSort {
    public static void main(String[] args) {
        int[] v = {12, 11, 13, 5, 6, 7};

        hybridSort(v, 0, v.length - 1);

        System.out.println(Arrays.toString(v));
    }

    static void hybridSort(int[] v, int inicio, int fim) {
        if (fim - inicio < 5) {
            bubbleSort(v, inicio, fim);
        } else if (inicio < fim) {
            int p = particionar(v, inicio, fim);
            hybridSort(v, inicio, p - 1);
            hybridSort(v, p + 1, fim);
        }
    }

    static void bubbleSort(int[] v, int inicio, int fim) {
        for (int i = inicio; i < fim; i++) {
            for (int j = inicio; j < fim - (i - inicio); j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }

        int aux = v[i + 1];
        v[i + 1] = v[fim];
        v[fim] = aux;

        return i + 1;
    }
}
