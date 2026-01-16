import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[4];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        double media = calcularMedia(valores);
        System.out.println(media);

        scanner.close();
    }

    static double calcularMedia(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return (double) soma / vetor.length;
    }
}
