import java.util.Scanner;

public class VerificaAprovacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = scanner.nextDouble();
        int frequencia = scanner.nextInt();
        System.out.println(media >= 7 && frequencia >= 75);
        scanner.close();
    }
}
