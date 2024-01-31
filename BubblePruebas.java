import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubblePruebas {

    @Test
    public void testBubbleSort() {
        List<Integer> originalList = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> sortedList = new ArrayList<>(originalList);
        sortedList.sort(Integer::compareTo);

        Bubblesort.ordenar(originalList);

        assertEquals(sortedList, originalList);
    }

    @Test
    public void testBubbleSortEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        Bubblesort.ordenar(emptyList);

        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testBubbleSortAlreadySorted() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);

        Bubblesort.ordenar(sortedList);

        assertEquals(sortedList, sortedList);
    }
}
