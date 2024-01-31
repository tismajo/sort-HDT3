import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {

    public static <T extends Comparable<T>> void ordenar(List<T> lista) {
        System.out.println("RADIX");
        if (lista == null || lista.size() == 0) {
            return;
        }

        T max = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }

        for (int exp = 1; obtenerDivisor(exp, max) > 0; exp *= 10) {
            contarSort(lista, exp);
        }
    }

    private static <T extends Comparable<T>> void contarSort(List<T> lista, int exp) {
        int n = lista.size();
        List<T> resultado = new ArrayList<>(n);
    
        List<LinkedList<T>> cuenta = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            cuenta.add(new LinkedList<>());
        }
    
        for (T elemento : lista) {
            int indice = obtenerIndice(elemento, exp);
            cuenta.get(indice).add(elemento);
        }
    
        for (int i = 0; i < 10; i++) {
            List<T> bucket = cuenta.get(i);
            bucket.sort(Comparable::compareTo);
            resultado.addAll(bucket);
        }
    
        for (int i = 0; i < n; i++) {
            lista.set(i, resultado.get(i));
        }
    }
    
    private static <T extends Comparable<T>> int obtenerDivisor(int exp, T max) {
        int divisor = 1;
        for (int i = 1; i < exp; i++) {
            divisor *= 10;
        }
        return divisor;
    }
        private static <T extends Comparable<T>> int obtenerIndice(T elemento, int exp) {
            int divisor = obtenerDivisor(exp, elemento);
            return ((datos) elemento).getNumero() / divisor % 10;
        }       
}
