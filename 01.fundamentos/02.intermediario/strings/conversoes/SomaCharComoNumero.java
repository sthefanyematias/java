import java.util.Scanner;

public class SomaCharComoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int soma = (int) a + (int) b;
        System.out.println(soma);

        sc.close();
    }
}
