import java.util.Scanner;

public class MediaVetorComCast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[4];
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
            soma += valores[i];
        }

        double media = (double) soma / valores.length;
        System.out.println(media);

        sc.close();
    }
}
