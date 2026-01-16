import java.util.Scanner;

public class CalculaDescontoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();

        if (valor >= 500) {
            valor = valor * 0.8;
        } else if (valor >= 200) {
            valor = valor * 0.9;
        }

        System.out.println(valor);
        scanner.close();
    }
}
