import java.util.Random;

public class MatrizRandomMedia {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int soma = 0;
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                soma += matriz[i][j];
                total++;
            }
        }

        double media = (double) soma / total;
        System.out.println(media);
    }
}
