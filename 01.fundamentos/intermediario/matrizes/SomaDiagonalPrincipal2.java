import java.util.Scanner;

public class SomaDiagonalPrincipal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println(soma);
        scanner.close();
    }
}
