import java.util.List;
import java.util.ArrayList;

public class MergeSort {

    public static <T extends Comparable<T>> void ordenar(List<T> lista) {
        System.out.println("MERGE");
        mergeSort(lista, 0, lista.size() - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(List<T> lista, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;

            mergeSort(lista, inicio, medio);
            mergeSort(lista, medio + 1, fin);

            merge(lista, inicio, medio, fin);
        }
    }

    private static <T extends Comparable<T>> void merge(List<T> lista, int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        List<T> listaIzquierda = new ArrayList<>(lista.subList(inicio, medio + 1));
        List<T> listaDerecha = new ArrayList<>(lista.subList(medio + 1, fin + 1));

        int i = 0, j = 0;

        int k = inicio;

        while (i < n1 && j < n2) {
            if (listaIzquierda.get(i).compareTo(listaDerecha.get(j)) <= 0) {
                lista.set(k, listaIzquierda.get(i));
                i++;
            } else {
                lista.set(k, listaDerecha.get(j));
                j++;
            }
            k++;
        }

     
        while (i < n1) {
            lista.set(k, listaIzquierda.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            lista.set(k, listaDerecha.get(j));
            j++;
            k++;
        }
    }
}

