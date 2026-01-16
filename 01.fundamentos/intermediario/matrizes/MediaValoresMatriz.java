import java.util.Scanner;

public class MediaValoresMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int soma = 0;
        int quantidade = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
                quantidade++;
            }
        }

        double media = (double) soma / quantidade;
        System.out.println(media);
        scanner.close();
    }
}
