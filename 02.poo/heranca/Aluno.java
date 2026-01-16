public class Aluno extends Pessoa {
    String curso;

    Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    void mostrarCurso() {
        System.out.println(curso);
    }
}
