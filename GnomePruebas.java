import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GnomePruebas {

    @Test
    public void testGnomeSort() {
        List<Integer> originalList = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> sortedList = new ArrayList<>(originalList);
        sortedList.sort(Integer::compareTo);

        GnomeSort.ordenar(originalList);

        assertEquals(sortedList, originalList);
    }

    @Test
    public void testGnomeSortEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        GnomeSort.ordenar(emptyList);

        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testGnomeSortAlreadySorted() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);

        GnomeSort.ordenar(sortedList);

        assertEquals(sortedList, sortedList);
    }
}
