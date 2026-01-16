import java.util.Scanner;

public class CharParaIntAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);

        int codigo = (int) letra;
        System.out.println(codigo);

        sc.close();
    }
}
