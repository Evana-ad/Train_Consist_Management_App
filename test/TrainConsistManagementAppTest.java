import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class TrainConsistManagementAppTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = new ArrayList<>(Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 72)
        ));

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(224, totalSeats);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = new ArrayList<>(Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 72)
        ));

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(224, totalSeats);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = new ArrayList<>(Collections.singletonList(
                new Bogie("AC Chair", 56)
        ));

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(56, totalSeats);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(0, totalSeats);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = new ArrayList<>(Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        ));

        List<Integer> capacities = bogies.stream()
                .map(Bogie::getCapacity)
                .toList();

        assertEquals(Arrays.asList(72, 56), capacities);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = new ArrayList<>(Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        ));

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(152, totalSeats);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>(Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        ));

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // Original list should remain unchanged
        assertEquals(2, bogies.size());
        assertEquals("Sleeper", bogies.get(0).getName());
        assertEquals("AC Chair", bogies.get(1).getName());
    }
}