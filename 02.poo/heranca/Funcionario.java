public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void mostrarSalario() {
        System.out.println(salario);
    }
}
