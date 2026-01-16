import java.util.Scanner;

public class ContaEspacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println(contador);
        scanner.close();
    }
}
