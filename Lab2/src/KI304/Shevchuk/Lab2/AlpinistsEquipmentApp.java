package KI304.Shevchuk.Lab2;
import KI304.Shevchuk.Lab2.AlpinistsEquipment;

import java.io.*;
/**
 * The {@code AlpinistsEquipmentApp} class serves as a driver program to test the functionality
 * of the {@link AlpinistsEquipment} class.
 */
public class AlpinistsEquipmentApp {
    public static void main(String[] args) throws FileNotFoundException {
        // Create instances of AlpinistsEquipment to test different constructors
        AlpinistsEquipment gear1 = new AlpinistsEquipment("Climbing Rope", 2500, "High-quality climbing rope for alpinists", 150);
        AlpinistsEquipment gear2 = new AlpinistsEquipment("Carabiner", 100, "Durable carabiner for safety", 20);
        AlpinistsEquipment gear3 = new AlpinistsEquipment("Crampons", 1800, "Spiked boots for ice climbing");

        // Inspect the equipment
        gear1.inspect();
        gear2.inspect();
        gear3.inspect();

        // Use the equipment
        gear1.use();
        gear2.use();

        // Log equipment details to a file
        String path = "C:\\Users\\oleks\\source\\repos\\KZP\\Lab2\\equipment_log.txt";
        gear1.logItemToFile(path);
        gear2.logItemToFile(path);
        gear3.logItemToFile(path);
    }
}
