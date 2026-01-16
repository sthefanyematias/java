import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        int opcao;

        do {
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < notas.length; i++) {
                        notas[i] = sc.nextDouble();
                    }
                    break;

                case 2:
                    double soma = 0;
                    for (int i = 0; i < notas.length; i++) {
                        soma += notas[i];
                    }
                    System.out.println(soma / notas.length);
                    break;

                case 3:
                    double maior = notas[0];
                    double menor = notas[0];

                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] > maior) maior = notas[i];
                        if (notas[i] < menor) menor = notas[i];
                    }

                    System.out.println(maior);
                    System.out.println(menor);
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
