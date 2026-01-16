import java.util.Scanner;

public class MediaLinhaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int linha = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == linha) {
                    soma += matriz[i][j];
                }
            }
        }

        double media = (double) soma / matriz[linha].length;
        System.out.println(media);
        scanner.close();
    }
}
