import java.util.Scanner;

public class MenuSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar");
                    break;
                case 2:
                    System.out.println("Listar");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
            }
        } while (opcao != 3);

        sc.close();
    }
}
