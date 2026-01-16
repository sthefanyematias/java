import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] v = {5, 3, 8, 6, 2, 7, 4, 1};

        mergeSort(v, 0, v.length - 1);

        System.out.println(Arrays.toString(v));
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
