import java.util.Scanner;

public class ValidaSenhaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;

        do {
            senha = sc.nextLine();
        } while (!senha.equals("1234"));

        System.out.println("Acesso liberado");
        sc.close();
    }
}
