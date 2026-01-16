import java.util.Arrays;

public class Ordenacoes {
    public static void main(String[] args) {
        int[] v1 = {9, 4, 7, 2, 1, 8};
        int[] v2 = {5, 3, 8, 6, 2, 7, 4, 1};
        int[] v3 = {10, 7, 8, 9, 1, 5};

        bubbleSort(v1);
        System.out.println(Arrays.toString(v1));

        quickSort(v2, 0, v2.length - 1);
        System.out.println(Arrays.toString(v2));

        mergeSort(v3, 0, v3.length - 1);
        System.out.println(Arrays.toString(v3));
    }

    static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
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

    static void mergeSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            intercalar(v, inicio, meio, fim);
        }
    }

    static void intercalar(int[] v, int inicio, int meio, int fim) {
        int[] aux = new int[v.length];
        for (int i = inicio; i <= fim; i++) {
            aux[i] = v[i];
        }

        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        while (i <= meio && j <= fim) {
            if (aux[i] <= aux[j]) {
                v[k++] = aux[i++];
            } else {
                v[k++] = aux[j++];
            }
        }

        while (i <= meio) {
            v[k++] = aux[i++];
        }
    }
}
