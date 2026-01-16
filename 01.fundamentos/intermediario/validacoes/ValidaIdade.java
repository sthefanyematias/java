import java.util.Scanner;

public class ValidaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        do {
            idade = sc.nextInt();
        } while (idade < 0);

        System.out.println(idade);
        sc.close();
    }
}
