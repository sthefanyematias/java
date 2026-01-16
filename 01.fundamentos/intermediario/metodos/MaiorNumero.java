import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int maior = obterMaior(a, b);
        System.out.println(maior);

        scanner.close();
    }

    static int obterMaior(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
}
