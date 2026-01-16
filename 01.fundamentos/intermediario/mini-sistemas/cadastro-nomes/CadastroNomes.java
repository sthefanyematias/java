import java.util.Scanner;

public class CadastroNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        int total = 0;
        int opcao;

        do {
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (total < nomes.length) {
                        sc.nextLine();
                        nomes[total] = sc.nextLine();
                        total++;
                    }
                    break;

                case 2:
                    for (int i = 0; i < total; i++) {
                        System.out.println(nomes[i]);
                    }
                    break;

                case 3:
                    sc.nextLine();
                    String busca = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < total; i++) {
                        if (nomes[i].equals(busca)) {
                            encontrado = true;
                        }
                    }

                    System.out.println(encontrado);
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
