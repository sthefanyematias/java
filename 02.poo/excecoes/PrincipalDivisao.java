import java.util.Scanner;

public class PrincipalDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Divisao d = new Divisao();

        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println(d.dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Erro na divisão");
        }
    }
}
