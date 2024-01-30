import java.util.List;

public class Bubblesort {
    
    public static <T extends Comparable<T>> void ordenar(List<T> lista) {
        int n = lista.size();
        boolean intercambio;

        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                
                if (lista.get(i - 1).compareTo(lista.get(i)) > 0) {
                    
                    T temp = lista.get(i - 1);
                    lista.set(i - 1, lista.get(i));
                    lista.set(i, temp);
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }
}

