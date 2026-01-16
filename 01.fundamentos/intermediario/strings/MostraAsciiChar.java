import java.util.Scanner;

public class MostraAsciiChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);

        int ascii = letra;
        System.out.println(ascii);

        sc.close();
    }
}
