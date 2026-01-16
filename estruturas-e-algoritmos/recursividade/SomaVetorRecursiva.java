public class SomaVetorRecursiva {
    public static void main(String[] args) {
        int[] v = {2, 4, 6, 8};

        System.out.println(soma(v, v.length - 1));
    }

    static int soma(int[] v, int i) {
        if (i < 0) {
            return 0;
        }
        return v[i] + soma(v, i - 1);
    }
}
