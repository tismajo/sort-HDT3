import java.util.List;

public class GnomeSort {

    public static <T extends Comparable<T>> void ordenar(List<T> lista) {
        int index = 0;
        System.out.println("GNOME");
        while (index < lista.size()) {
            if (index == 0 || lista.get(index - 1).compareTo(lista.get(index)) <= 0) {
                index++;
            } else {
                T temp = lista.get(index);
                lista.set(index, lista.get(index - 1));
                lista.set(index - 1, temp);
                index--;
            }
        }
    }
}
