import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 25, 30, 42, 55, 68, 79};
        System.out.print("Valor: ");
        int valor = sc.nextInt();

        int posicao = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Encontrado na posicao " + posicao);
        } else {
            System.out.println("Nao encontrado");
        }
    }
}
