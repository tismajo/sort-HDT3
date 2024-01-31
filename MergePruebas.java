import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergePruebas {

    @Test
    public void testMergeSort() {
        List<Integer> originalList = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> sortedList = new ArrayList<>(originalList);
        sortedList.sort(Integer::compareTo);

        MergeSort.ordenar(originalList);

        assertEquals(sortedList, originalList);
    }

    @Test
    public void testMergeSortEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        MergeSort.ordenar(emptyList);

        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testMergeSortAlreadySorted() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);

        MergeSort.ordenar(sortedList);

        assertEquals(sortedList, sortedList);
    }
}
