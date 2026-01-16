public class SomaRecursiva {

    int somar(int[] v, int i) {
        if (i == v.length) {
            return 0;
        }
        return v[i] + somar(v, i + 1);
    }
}
