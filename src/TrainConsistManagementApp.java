import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    String getType() {
        return type;
    }

    public String toString() {
        return type + " Bogie | Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("Sleeper", 65));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("AC Chair", 80));
        bogies.add(new Bogie("First Class", 45));

        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Bogies Grouped By Type:\n");

        for (String type : groupedBogies.keySet()) {
            System.out.println("=== " + type + " ===");
            for (Bogie b : groupedBogies.get(type)) {
                System.out.println(b);
            }
            System.out.println();
        }
    }
}