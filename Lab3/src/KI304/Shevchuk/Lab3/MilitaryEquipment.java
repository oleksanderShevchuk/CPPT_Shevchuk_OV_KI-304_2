package KI304.Shevchuk.Lab3;

/**
 * The {@code MilitaryEquipment} interface defines methods and properties for military equipment.
 * Implementing classes should provide specific implementations of these methods and properties.
 */
public interface MilitaryEquipment {
    /**
     * Gets the camouflage pattern of the military equipment.
     *
     * @return The camouflage pattern.
     */
    int getCamoPattern();

    /**
     * Sets the camouflage pattern of the military equipment.
     *
     * @param camoPattern The camouflage pattern to set.
     */
    void setCamoPattern(int camoPattern);
    /**
     * Performs a special military function.
     * Implementing classes should define the specific function.
     */
    void specialMilitaryInspect();

}
