import java.util.Scanner;

public class LeituraAlturaPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura = scanner.nextDouble();
        double peso = scanner.nextDouble();
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        scanner.close();
    }
}
