import java.util.Scanner;

public class ContaElementosAcimaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int soma = 0;
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
                total++;
            }
        }

        double media = (double) soma / total;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > media) {
                    contador++;
                }
            }
        }

        System.out.println(contador);
        scanner.close();
    }
}
