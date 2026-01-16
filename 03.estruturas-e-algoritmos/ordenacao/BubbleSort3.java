import java.util.Arrays;

public class BubbleSort3 {
    public static void main(String[] args) {
        int[] v = {9, 4, 7, 2, 1, 8};

        bubbleSort(v);

        System.out.println(Arrays.toString(v));
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
}
