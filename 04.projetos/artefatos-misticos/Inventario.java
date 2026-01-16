import java.util.ArrayList;

public class Inventario {
    ArrayList<Artefato> artefatos = new ArrayList<>();

    public void adicionar(Artefato a) {
        artefatos.add(a);
    }

    public void listar() {
        for (int i = 0; i < artefatos.size(); i++) {
            Artefato a = artefatos.get(i);
            System.out.println(i + " - " + a.nome + " - Poder: " + a.poder);
        }
    }

    public int somaPoderes() {
        int soma = 0;
        for (Artefato a : artefatos) {
            soma += a.poder;
        }
        return soma;
    }

    public Artefato buscarPorNome(String nome) {
        for (Artefato a : artefatos) {
            if (a.nome.equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }
}
