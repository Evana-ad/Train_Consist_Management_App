import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity + " seats";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));

        System.out.println("Train Bogies:");
        bogies.forEach(System.out::println);

        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train = " + totalSeats);
    }
}