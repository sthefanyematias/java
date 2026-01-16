import java.util.Scanner;

public class ValidaDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;

        do {
            b = sc.nextInt();
        } while (b == 0);

        double resultado = (double) a / b;
        System.out.println(resultado);

        sc.close();
    }
}
