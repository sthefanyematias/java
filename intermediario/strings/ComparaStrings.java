import java.util.Scanner;

public class ComparaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(a.equals(b));
        scanner.close();
    }
}
