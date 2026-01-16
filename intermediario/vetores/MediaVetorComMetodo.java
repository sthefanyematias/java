import java.util.Scanner;

public class MediaVetorComMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextDouble();
        }

        System.out.println(calcularMedia(valores));
        scanner.close();
    }

    static double calcularMedia(double[] valores) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma / valores.length;
    }
}
