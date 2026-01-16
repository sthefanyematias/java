import java.util.Scanner;

public class LeituraIdadeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        System.out.println("Idade informada: " + idade);
        scanner.close();
    }
}
