import java.util.Scanner;

public class SomaDoubleParaInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        int soma = (int) (a + b);
        System.out.println(soma);

        sc.close();
    }
}
