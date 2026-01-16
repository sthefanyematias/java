public class PalindromoRecursivo {
    public static void main(String[] args) {
        String palavra = "radar";

        System.out.println(verificar(palavra, 0, palavra.length() - 1));
    }

    static boolean verificar(String s, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (s.charAt(inicio) != s.charAt(fim)) {
            return false;
        }
        return verificar(s, inicio + 1, fim - 1);
    }
}
