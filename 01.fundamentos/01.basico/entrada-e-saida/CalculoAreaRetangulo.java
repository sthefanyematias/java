import java.util.Scanner;

public class CalculoAreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("Area: " + area);
        scanner.close();
    }
}
