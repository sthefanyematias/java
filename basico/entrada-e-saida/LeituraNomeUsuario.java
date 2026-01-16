import java.util.Scanner;

public class LeituraNomeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Bem-vindo, " + nome);
        scanner.close();
    }
}
