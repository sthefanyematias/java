import java.util.Arrays;

public class PrincipalAluno {
    public static void main(String[] args) {
        double[] notas = {7.0, 8.5, 9.0};
        Aluno a = new Aluno("Sthefany", notas);

        System.out.println(Arrays.toString(a.notas));
        System.out.println(a.calcularMedia());
    }
}
