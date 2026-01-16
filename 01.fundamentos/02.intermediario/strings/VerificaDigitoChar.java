import java.util.Scanner;

public class VerificaDigitoChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        boolean ehDigito = c >= '0' && c <= '9';
        System.out.println(ehDigito);

        sc.close();
    }
}
