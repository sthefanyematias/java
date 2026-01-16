import java.util.Scanner;

public class ExibeDadosEndereco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rua = scanner.nextLine();
        int numero = scanner.nextInt();
        scanner.nextLine();
        String bairro = scanner.nextLine();
        String cidade = scanner.nextLine();
        System.out.println(rua + ", " + numero);
        System.out.println(bairro);
        System.out.println(cidade);
        scanner.close();
    }
}
