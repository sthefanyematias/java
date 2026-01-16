public class PrincipalPalindromo {
    public static void main(String[] args) {
        String texto = "radar";

        Palindromo p = new Palindromo();
        System.out.println(p.verificar(texto, 0, texto.length() - 1));
    }
}
