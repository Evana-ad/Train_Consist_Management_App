import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        System.out.println("\n--- Adding Passenger Bogies ---");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        System.out.println("\n--- Removing a Bogie (AC Chair) ---");
        passengerBogies.remove("AC Chair");
        System.out.println("After removal:");
        System.out.println(passengerBogies);

        System.out.println("\n--- Checking Bogie Availability ---");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram ready for next operations...");
    }
}