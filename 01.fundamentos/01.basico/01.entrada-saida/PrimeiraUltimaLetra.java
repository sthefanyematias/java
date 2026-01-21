import java.util.Scanner;

public class Letras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        char primeira = palavra.charAt(0);
        char ultima = palavra.charAt(palavra.length() - 1);

        System.out.println("Primeira letra: " + primeira);
        System.out.println("Última letra: " + ultima);

        sc.close();
    }
}
