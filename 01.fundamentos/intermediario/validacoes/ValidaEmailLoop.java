import java.util.Scanner;

public class ValidaEmailLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;

        do {
            email = sc.nextLine();
        } while (!email.contains("@") || !email.contains("."));

        System.out.println(email);
        sc.close();
    }
}
