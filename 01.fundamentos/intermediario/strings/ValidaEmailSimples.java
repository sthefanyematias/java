import java.util.Scanner;

public class ValidaEmailSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        boolean valido = email.contains("@") && email.contains(".");
        System.out.println(valido);

        scanner.close();
    }
}
