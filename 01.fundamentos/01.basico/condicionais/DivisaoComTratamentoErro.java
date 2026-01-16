import java.util.Scanner;

public class DivisaoComTratamentoErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Erro");
        }

        scanner.close();
    }
}
