import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        int soma = somarVetor(valores);
        System.out.println(soma);

        scanner.close();
    }

    static int somarVetor(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return soma;
    }
}
