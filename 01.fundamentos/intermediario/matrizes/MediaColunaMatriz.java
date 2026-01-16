import java.util.Scanner;

public class MediaColunaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int coluna = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
                if (j == coluna) {
                    soma += matriz[i][j];
                }
            }
        }

        double media = (double) soma / matriz.length;
        System.out.println(media);
        scanner.close();
    }
}
