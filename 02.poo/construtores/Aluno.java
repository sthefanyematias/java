public class Aluno {
    String nome;
    double[] notas;

    Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
