import java.util.Arrays;

public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Sthefany";
        a.notas = new double[]{7.5, 8.0, 9.0};

        System.out.println(Arrays.toString(a.notas));
        System.out.println(a.calcularMedia());
    }
}
