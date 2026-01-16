import java.util.Scanner;

public class ContaNumerosParesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int pares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println(pares);
        scanner.close();
    }
}
