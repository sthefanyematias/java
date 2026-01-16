import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] v = {10, 7, 8, 9, 1, 5};

        quickSort(v, 0, v.length - 1);

        System.out.println(Arrays.toString(v));
    }

    static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(v, inicio, fim);
            quickSort(v, inicio, p - 1);
            quickSort(v, p + 1, fim);
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
