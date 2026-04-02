import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static boolean validateTrainID(String trainID) {
        String trainPattern = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(trainPattern);
        Matcher matcher = pattern.matcher(trainID);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        String cargoPattern = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(cargoPattern);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainID = sc.nextLine();
        if (validateTrainID(trainID)) {
            System.out.println("Valid Train ID!");
        } else {
            System.out.println("Invalid Train ID!");
        }

        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoCode = sc.nextLine();
        if (validateCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code!");
        } else {
            System.out.println("Invalid Cargo Code!");
        }

        sc.close();
    }
}