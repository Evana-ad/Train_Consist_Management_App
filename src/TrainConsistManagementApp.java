import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("\n--- Filtering High Capacity Bogies ---");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury Coach", 80));

        List<Bogie> highCapacityBogies =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        System.out.println("Bogies with capacity > 60:");

        for (Bogie b : highCapacityBogies) {
            System.out.println(b.name + " -> " + b.capacity + " seats");
        }

        System.out.println("\nProgram ready for next operations...");
    }
}