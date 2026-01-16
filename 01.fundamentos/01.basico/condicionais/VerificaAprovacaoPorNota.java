import java.util.Scanner;

public class VerificaAprovacaoPorNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
