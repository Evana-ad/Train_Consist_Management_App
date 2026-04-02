import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " bogie carrying " + cargo;
    }
}

public class TrainConsistManagementApp {

    // UC12: Safety check method
    public static boolean isTrainSafetyCompliant(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b -> !b.getType().equalsIgnoreCase("Cylindrical")
                        || b.getCargo().equalsIgnoreCase("Petroleum"));
    }

    public static void main(String[] args) {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(System.out::println);

        boolean safe = isTrainSafetyCompliant(goodsBogies);

        System.out.println("\nTrain Safety Compliant? " + (safe ? "YES" : "NO"));
    }
}