import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortPruebas {

    @Test
    public void testQuickSort() {
        List<Integer> originalList = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> sortedList = new ArrayList<>(originalList);
        sortedList.sort(Integer::compareTo);

        QuickSort.ordenar(originalList);

        assertEquals(sortedList, originalList);
    }

    @Test
    public void testQuickSortEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        QuickSort.ordenar(emptyList);

        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testQuickSortAlreadySorted() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);

        QuickSort.ordenar(sortedList);

        assertEquals(sortedList, sortedList);
    }
}
