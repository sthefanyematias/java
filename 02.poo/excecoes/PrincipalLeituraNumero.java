import java.util.Scanner;

public class PrincipalLeituraNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeituraNumero l = new LeituraNumero();

        try {
            String valor = sc.nextLine();
            int numero = l.ler(valor);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido");
        }
    }
}
