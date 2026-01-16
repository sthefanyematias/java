import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int resultado = somar(a, b);
        System.out.println(resultado);

        scanner.close();
    }

    static int somar(int x, int y) {
        return x + y;
    }
}
