import java.util.Scanner;

public class MediaTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double media = calcularMedia(a, b, c);
        System.out.println(media);

        scanner.close();
    }

    static double calcularMedia(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
