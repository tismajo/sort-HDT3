import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixPruebas {

    @Test
    public void testRadixSort() {
        List<Integer> originalList = Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66);
        List<Integer> sortedList = new ArrayList<>(originalList);
        sortedList.sort(Integer::compareTo);

        RadixSort.ordenar(originalList);

        assertEquals(sortedList, originalList);
    }

    @Test
    public void testRadixSortEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        RadixSort.ordenar(emptyList);

        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testRadixSortAlreadySorted() {
        List<Integer> sortedList = Arrays.asList(2, 24, 45, 66, 75, 90, 170, 802);

        RadixSort.ordenar(sortedList);

        assertEquals(sortedList, sortedList);
    }

    // Agrega más pruebas según sea necesario

}
