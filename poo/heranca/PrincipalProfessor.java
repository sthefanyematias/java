public class PrincipalProfessor {
    public static void main(String[] args) {
        Professor p = new Professor("Carlos", 3500, "POO");

        System.out.println(p.nome);
        p.mostrarSalario();
        p.mostrarDisciplina();
    }
}
