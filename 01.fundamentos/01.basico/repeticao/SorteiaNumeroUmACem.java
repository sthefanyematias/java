import java.util.Random;

public class SorteiaNumeroUmACem {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(100) + 1;
        System.out.println(numero);
    }
}
