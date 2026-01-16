import java.util.Scanner;

public class IntParaCharAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();

        char letra = (char) codigo;
        System.out.println(letra);

        sc.close();
    }
}
