import java.util.Random;

public class PreencheVetorComRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50);
            System.out.println(numeros[i]);
        }
    }
}
