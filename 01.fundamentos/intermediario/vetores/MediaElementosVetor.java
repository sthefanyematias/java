import java.util.Scanner;

public class MediaElementosVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[4];
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        System.out.println(soma / valores.length);
        scanner.close();
    }
}
