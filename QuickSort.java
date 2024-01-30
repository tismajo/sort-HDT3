import java.util.List;

public class QuickSort {

    public static <T extends Comparable<T>> void ordenar(List<T> lista) {
        quickSort(lista, 0, lista.size() - 1);
    }

    private static <T extends Comparable<T>> void quickSort(List<T> lista, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(lista, inicio, fin);

            quickSort(lista, inicio, indiceParticion - 1);
            quickSort(lista, indiceParticion + 1, fin);
        }
    }

    private static <T extends Comparable<T>> int particion(List<T> lista, int inicio, int fin) {
        T pivote = lista.get(fin);
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (lista.get(j).compareTo(pivote) <= 0) {
                i++;

                T temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        T temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(fin));
        lista.set(fin, temp);

        return i + 1;
    }
}
