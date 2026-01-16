import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 12, 18, 23, 35, 47, 60, 72};
        System.out.print("Valor: ");
        int valor = sc.nextInt();

        int inicio = 0;
        int fim = numeros.length - 1;
        int posicao = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (numeros[meio] == valor) {
                posicao = meio;
                break;
            } else if (valor > numeros[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (posicao != -1) {
            System.out.println("Encontrado na posicao " + posicao);
        } else {
            System.out.println("Nao encontrado");
        }
    }
}
