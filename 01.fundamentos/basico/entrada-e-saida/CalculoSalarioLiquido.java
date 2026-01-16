import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBruto = scanner.nextDouble();
        double desconto = scanner.nextDouble();
        double salarioLiquido = salarioBruto - desconto;
        System.out.println("Salario liquido: " + salarioLiquido);
        scanner.close();
    }
}
