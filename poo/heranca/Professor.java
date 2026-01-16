public class Professor extends Funcionario {
    String disciplina;

    Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    void mostrarDisciplina() {
        System.out.println(disciplina);
    }
}
