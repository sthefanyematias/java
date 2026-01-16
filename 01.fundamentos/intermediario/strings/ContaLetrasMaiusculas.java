import java.util.Scanner;

public class ContaLetrasMaiusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                contador++;
            }
        }

        System.out.println(contador);
        sc.close();
    }
}
