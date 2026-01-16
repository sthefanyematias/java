import java.util.Scanner;

public class VerificaAcessoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();
        String senha = scanner.nextLine();
        System.out.println(usuario.equals("admin") && senha.equals("123"));
        scanner.close();
    }
}
