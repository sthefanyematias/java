public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Sthefany", 20);

        p.setIdade(21);

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
}
