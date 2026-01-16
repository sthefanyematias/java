public class Palindromo {

    boolean verificar(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return verificar(texto, inicio + 1, fim - 1);
    }
}
