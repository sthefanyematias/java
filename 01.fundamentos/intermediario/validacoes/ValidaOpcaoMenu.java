import java.util.Scanner;

public class ValidaOpcaoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            opcao = sc.nextInt();
        } while (opcao < 1 || opcao > 3);

        System.out.println(opcao);
        sc.close();
    }
}
