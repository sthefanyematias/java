import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartao cartao = new Cartao(500);

        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();

        if (cartao.sacar(valor)) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Compra negada");
        }

        System.out.println("Saldo atual: " + cartao.getSaldo());
    }
}
