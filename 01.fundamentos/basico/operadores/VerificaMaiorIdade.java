import java.util.Scanner;

public class VerificaMaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        System.out.println(idade >= 18);
        scanner.close();
    }
}
