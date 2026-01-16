import java.util.Scanner;

public class ValidaNumeroPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            numero = sc.nextInt();
        } while (numero % 2 != 0);

        System.out.println(numero);
        sc.close();
    }
}
