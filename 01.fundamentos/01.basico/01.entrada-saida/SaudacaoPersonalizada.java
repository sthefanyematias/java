import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.println("Olá, " + nome + " de " + cidade + "! Seja bem-vindo(a)!");
        sc.close();
    }
}
