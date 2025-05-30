import java.util.ArrayList;

public class InversoRecursivo {

    public static void mostrarInverso(ArrayList<String> lista, int i) {
        if (i < lista.size()) {
            mostrarInverso(lista, i + 1);
            System.out.println(lista.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("dedos de los pies");
        lista.add("pies");
        lista.add("rodillas");
        lista.add("muslos");
        lista.add("caderas");
        lista.add("cintura");
        lista.add("gluteos");
        lista.add("tronco");
        lista.add("abdomen");
        lista.add("pecho");
        lista.add("espalda");
        lista.add("manos");
        lista.add("brazos");
        lista.add("hombros");
        lista.add("cuello");
        lista.add("cabeza");
        lista.add("cabello");

        mostrarInverso(lista, 0);
    }
}
