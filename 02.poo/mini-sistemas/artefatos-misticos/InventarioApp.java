import java.util.ArrayList;

public class InventarioApp {
    public static void main(String[] args) {
        ArrayList<Artefato> artefatos = new ArrayList<>();

        artefatos.add(new Artefato("Amuleto", 50));
        artefatos.add(new Artefato("Espada", 80));

        int soma = 0;

        for (Artefato a : artefatos) {
            soma += a.poder;
        }

        System.out.println(soma);
    }
}
