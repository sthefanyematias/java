public class Contador {

    void contar(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        contar(n - 1);
    }
}
