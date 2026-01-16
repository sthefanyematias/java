import java.util.Scanner;

public class SomaIntParaDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double soma = (double) a + b;
        System.out.println(soma);

        sc.close();
    }
}
