import java.util.Scanner;

public class ValidaEntradaComTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                int numero = sc.nextInt();
                System.out.println(numero);
                valido = true;
            } catch (Exception e) {
                sc.next();
            }
        }

        sc.close();
    }
}
