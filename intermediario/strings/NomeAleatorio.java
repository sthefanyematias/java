import java.util.Random;

public class NomeAleatorio {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};
        Random random = new Random();

        int posicao = random.nextInt(nomes.length);
        System.out.println(nomes[posicao]);
    }
}
