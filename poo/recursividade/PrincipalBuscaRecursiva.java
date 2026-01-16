public class PrincipalBuscaRecursiva {
    public static void main(String[] args) {
        int[] v = {3, 7, 9, 2};

        BuscaRecursiva b = new BuscaRecursiva();
        System.out.println(b.buscar(v, 0, 9));
    }
}
