import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numeros = {9, 4, 7, 2, 1, 8};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));
    }
}
