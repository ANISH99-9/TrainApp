import java.util.ArrayList;
import java.util.List;

public class traina2pp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Removing a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nPassenger bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Check if "Sleeper" exists
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final state of list
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        // Program continues
        System.out.println("\nSystem ready for next operations.");
    }
}