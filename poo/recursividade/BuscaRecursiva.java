public class BuscaRecursiva {

    boolean buscar(int[] v, int i, int valor) {
        if (i == v.length) {
            return false;
        }
        if (v[i] == valor) {
            return true;
        }
        return buscar(v, i + 1, valor);
    }
}
