import java.util.Scanner;

public class ValidaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            nota = sc.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println(nota);
        sc.close();
    }
}
