import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println("A palavra '" + palavra + "' tem " + palavra.length() + " letras.");
        sc.close();
    }
}
