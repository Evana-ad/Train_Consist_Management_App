import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        System.out.println("\n--- Tracking Unique Bogie IDs ---");

        HashSet<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        System.out.println("\nProgram ready for next operations...");
    }
}