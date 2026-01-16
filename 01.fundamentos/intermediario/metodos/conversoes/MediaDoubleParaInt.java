import java.util.Scanner;

public class MediaDoubleParaInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        int media = (int) ((a + b + c) / 3);
        System.out.println(media);

        sc.close();
    }
}
