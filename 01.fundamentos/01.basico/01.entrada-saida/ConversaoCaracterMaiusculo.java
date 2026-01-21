import java.util.Scanner;

public class Maiusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println("Em maiúsculas: " + palavra.toUpperCase());
        sc.close();
    }
}
