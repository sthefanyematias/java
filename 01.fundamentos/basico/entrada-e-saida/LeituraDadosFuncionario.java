import java.util.Scanner;

public class LeituraDadosFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        String cargo = scanner.nextLine();
        double salario = scanner.nextDouble();
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        scanner.close();
    }
}
