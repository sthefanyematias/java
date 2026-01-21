import java.util.Scanner;

public class RepetirMensagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma mensagem: ");
        String mensagem = sc.nextLine();

        System.out.print("Quantas vezes deseja repetir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ": " + mensagem);
        }

        sc.close();
    }
}
