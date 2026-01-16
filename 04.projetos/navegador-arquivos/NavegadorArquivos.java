import java.io.File;
import java.util.Scanner;

public class NavegadorArquivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caminho = "C:\\"; // você pode alterar para outra pasta
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n1 - Listar arquivos");
            System.out.println("2 - Listar pastas e arquivos recursivamente");
            System.out.println("3 - Sair");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        listarArquivos(caminho);
                        break;
                    case 2:
                        listarRecursivo(new File(caminho), 0);
                        break;
                    case 3:
                        System.out.println("Encerrando Navegador");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida");
                sc.nextLine();
            }
        }
    }

    static void listarArquivos(String caminho) {
        File pasta = new File(caminho);
        File[] arquivos = pasta.listFiles();

        if (arquivos != null) {
            for (File f : arquivos) {
                System.out.println(f.getName());
            }
        }
    }

    static void listarRecursivo(File pasta, int nivel) {
        File[] arquivos = pasta.listFiles();
        if (arquivos != null) {
            for (File f : arquivos) {
                for (int i = 0; i < nivel; i++) System.out.print("  ");
                System.out.println(f.getName());
                if (f.isDirectory()) {
                    listarRecursivo(f, nivel + 1);
                }
            }
        }
    }
}
