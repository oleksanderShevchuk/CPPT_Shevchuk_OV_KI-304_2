package KI304.Shevchuk.Lab3;

/**
 * The {@code MilitaryAlpinistsEquipmentApp} class serves as a driver program to test the
 * functionality of the {@code MilitaryAlpinistsEquipment} class.
 */
public class MilitaryAlpinistsEquipmentApp {
    /**
     * The main method used to test the {@code MilitaryAlpinistsEquipment} class.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create instances of MilitaryAlpinistsEquipment to test
        MilitaryAlpinistsEquipment gear1 = new MilitaryAlpinistsEquipment("Tactical Harness", 1200,
                "High-quality tactical harness for military alpinists", 250, 3, true);
        MilitaryAlpinistsEquipment gear2 = new MilitaryAlpinistsEquipment("Climbing Helmet", 800,
                "Durable climbing helmet with night vision mount", 150, 2, true);
        MilitaryAlpinistsEquipment gear3 = new MilitaryAlpinistsEquipment("Rope Ladder", 1500,
                "Special rope ladder for covert operations", 300, 1, false);

        // Use and inspect the military alpinist equipment
        gear1.specialMilitaryInspect();
        gear2.specialMilitaryInspect();
        gear3.specialMilitaryInspect();

        // Log equipment details to a file
        gear1.logItemToFile("military_equipment_log.txt");
        gear2.logItemToFile("military_equipment_log.txt");
        gear3.logItemToFile("military_equipment_log.txt");
    }
}
