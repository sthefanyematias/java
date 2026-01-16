import java.util.Scanner;

public class TamanhoNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        int tamanho = contarCaracteres(nome);
        System.out.println(tamanho);

        scanner.close();
    }

    static int contarCaracteres(String texto) {
        return texto.length();
    }
}
