import java.util.*;

public class QuickSort {

    public static <T extends Comparable<T>> void ordenar(List<T> lista) {
        System.out.println("QUICK");
        quickSort(lista);
    }

    private static <T extends Comparable<T>> void quickSort(List<T> lista) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(lista.size() - 1);

        while (!stack.isEmpty()) {
            int fin = stack.pop();
            int inicio = stack.pop();

            if (inicio < fin) {
                int indiceParticion = particion(lista, inicio, fin);

                stack.push(inicio);
                stack.push(indiceParticion - 1);

                stack.push(indiceParticion + 1);
                stack.push(fin);
            }
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
