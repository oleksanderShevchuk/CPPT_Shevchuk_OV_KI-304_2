package KI304.Shevchuk.Lab3;

/**
 * The {@code MilitaryAlpinistsEquipment} class represents military equipment for alpinists.
 * It implements the {@link MilitaryEquipment} interface.
 */
public class MilitaryAlpinistsEquipment extends AlpinistsEquipment implements MilitaryEquipment {
    private int camoPattern;
    private boolean nightVision;

    /**
     * Constructs a new MilitaryAlpinistsEquipment object with the specified parameters.
     *
     * @param itemName     The name of the equipment.
     * @param weight       The weight of the equipment in grams.
     * @param description  The description of the equipment.
     * @param price        The price of the equipment in dollars.
     * @param camoPattern  The camouflage pattern of the equipment.
     * @param nightVision  Indicates whether the equipment has night vision capability.
     */
    public MilitaryAlpinistsEquipment(String itemName, double weight, String description, double price, int camoPattern, boolean nightVision) {
        super(itemName, weight, description, price);
        this.camoPattern = camoPattern;
        this.nightVision = nightVision;
    }

    /**
     * Gets the camouflage pattern of the military equipment.
     *
     * @return The camouflage pattern.
     */
    @Override
    public int getCamoPattern() {
        return camoPattern;
    }

    /**
     * Sets the camouflage pattern of the military equipment.
     *
     * @param camoPattern The camouflage pattern to set.
     */
    @Override
    public void setCamoPattern(int camoPattern) {
        this.camoPattern = camoPattern;
    }

    /**
     * Gets whether the military equipment has night vision capability.
     *
     * @return {@code true} if the equipment has night vision; {@code false} otherwise.
     */
    public boolean hasNightVision() {
        return nightVision;
    }

    /**
     * Sets whether the military equipment has night vision capability.
     *
     * @param nightVision {@code true} if the equipment has night vision; {@code false} otherwise.
     */
    public void setNightVision(boolean nightVision) {
        this.nightVision = nightVision;
    }

    /**
     * Performs a special military inspection specific to this equipment.
     * This method extends the base equipment inspection and adds military-specific checks.
     */
    @Override
    public void specialMilitaryInspect() {
        // Call the base class method (AlpinistsEquipment) to inspect the general equipment
        super.inspect();

        // Add specific checks for military alpinist equipment
        System.out.println("Performing a special military function with: " + getItemName());

        // Check for the presence of night vision capability
        if (hasNightVision()) {
            System.out.println("Using night vision for a special operation...");
        } else {
            System.out.println("This equipment does not have night vision capability.");
        }

        // Check for the presence of a special property in the equipment
        if (getDescription().toLowerCase().contains("special")) {
            System.out.println("Utilizing the special property of this equipment...");
        } else {
            System.out.println("This equipment does not have a special property.");
        }
    }
}
