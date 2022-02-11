import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class Tests {
    ArrayList<Student> unsorted;

    private void unsort(){
        unsorted.clear();
        unsorted.add(new Student("a", 33));
        unsorted.add(new Student("b", 23));
        unsorted.add(new Student("c", 1));
        unsorted.add(new Student("d", 50));
    }

    @Test
    public void recursiveBubbleSortTest(){
        unsorted = new ArrayList<>();
        unsort();
        Sorts sort = new Sorts();
        sort.recursiveBubbleSort(unsorted, unsorted.size());
        assertEquals(1, unsorted.get(0).getCode());
        assertEquals(23, unsorted.get(1).getCode());
        assertEquals(33, unsorted.get(2).getCode());
        assertEquals(50, unsorted.get(3).getCode());
    }

    @Test
    public void gnomeSortTest(){
        unsorted = new ArrayList<>();
        unsort();
        Sorts sort = new Sorts();
        sort.gnomeSort(unsorted, unsorted.size());
        assertEquals(1, unsorted.get(0).getCode());
        assertEquals(23, unsorted.get(1).getCode());
        assertEquals(33, unsorted.get(2).getCode());
        assertEquals(50, unsorted.get(3).getCode());
    }
}
