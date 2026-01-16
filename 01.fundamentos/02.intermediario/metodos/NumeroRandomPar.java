import java.util.Random;

public class NumeroRandomPar {
    public static void main(String[] args) {
        int numero = gerarNumero();
        boolean par = ehPar(numero);

        System.out.println(numero);
        System.out.println(par);
    }

    static int gerarNumero() {
        Random random = new Random();
        return random.nextInt(100);
    }

    static boolean ehPar(int n) {
        return n % 2 == 0;
    }
}
