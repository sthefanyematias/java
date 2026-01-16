import java.util.Scanner;

public class SomaAsciiNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int soma = 0;

        for (int i = 0; i < nome.length(); i++) {
            soma += nome.charAt(i);
        }

        System.out.println(soma);
        sc.close();
    }
}
