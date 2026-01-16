import java.util.Scanner;

public class DivisaoComCast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double resultado = (double) a / b;
        System.out.println(resultado);

        sc.close();
    }
}
