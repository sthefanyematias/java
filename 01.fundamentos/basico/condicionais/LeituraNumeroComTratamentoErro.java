import java.util.Scanner;

public class LeituraNumeroComTratamentoErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int numero = scanner.nextInt();
            System.out.println(numero);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}
