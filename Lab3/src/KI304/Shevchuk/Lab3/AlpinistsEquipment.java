package KI304.Shevchuk.Lab3;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The {@code AlpinistsEquipment} class represents alpinist's equipment.
 * It stores information about an equipment item, such as its name, weight, price, and description.
 * The class provides methods to log equipment-related actions and inspect the equipment.
 */
public abstract class AlpinistsEquipment {
    // Fields for storing equipment details
    private String itemName;
    private double weight;
    private String description;
    private double price;
    private static final String LOG_FILE_NAME = "gear_log.txt";

    /**
     * Constructs an equipment item with a known price.
     *
     * @param itemName    The name of the equipment item.
     * @param weight      The weight of the equipment item in grams.
     * @param description A description of the equipment item.
     * @param price       The price of the equipment item in dollars.
     */
    public AlpinistsEquipment(String itemName, double weight, String description, double price) {
        this.itemName = itemName;
        this.weight = weight;
        this.description = description;
        this.price = price;
    }

    /**
     * Constructs an equipment item without a known price.
     *
     * @param itemName    The name of the equipment item.
     * @param weight      The weight of the equipment item in grams.
     * @param description A description of the equipment item.
     */
    public AlpinistsEquipment(String itemName, double weight, String description) {
        this.itemName = itemName;
        this.weight = weight;
        this.description = description;
    }

    /**
     * Constructs an equipment item without a known price or description.
     *
     * @param itemName The name of the equipment item.
     * @param weight   The weight of the equipment item in grams.
     */
    public AlpinistsEquipment(String itemName, double weight) {
        this.itemName = itemName;
        this.weight = weight;
    }

    // Getters and setters for equipment properties
    /**
     * Set the name of the equipment item.
     *
     * @param itemName The name of the equipment item.
     */
    public void setItemName(String itemName) {this.itemName = itemName;}
    /**
     * Get the name of the equipment item.
     *
     * @return The name of the equipment item.
     */
    public String getItemName() {
        return itemName;
    }
    /**
     * Set the weight of the equipment item in grams.
     *
     * @param weight The weight of the equipment item.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Get the weight of the equipment item in grams.
     *
     * @return The weight of the equipment item.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set the description of the equipment item.
     *
     * @param description A description of the equipment item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the description of the equipment item.
     *
     * @return A description of the equipment item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the price of the equipment item in dollars.
     *
     * @param price The price of the equipment item.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the price of the equipment item in dollars.
     *
     * @return The price of the equipment item.
     */
    public double getPrice() {
        return price;
    }

    // Method to log information about the item to a file

    /**
     * Log equipment-related actions to a log file.
     *
     * @param message The message to log.
     */
    private void logToFile(String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());

        String logMessage = "[" + timestamp + "] " + message;

        try (FileWriter writer = new FileWriter(LOG_FILE_NAME, true)) {
            writer.write(logMessage + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log equipment item details to a specified file.
     *
     * @param filename The name of the file to log to.
     */
    public void logItemToFile(String filename) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(filename, true);
            writer.write("Name: " + itemName + "\n");
            writer.write("Weight: " + weight + " g\n");
            writer.write("Price: $" + price + "\n");
            writer.write("Description: " + description + "\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logToFile("Logged equipment item: " + itemName);
    }

    /**
     * Simulate the use of the equipment item.
     */
    public void use() {
        System.out.println("\nYou use an item of equipment: " + itemName);
        System.out.println("The " + itemName + " weighs " + weight + " gram(s)");
        System.out.println("The " + itemName + " costs $" + price);
        System.out.println("The " + itemName + " has the following description: " + description);
        logToFile("Equipment item used: " + itemName);
    }

    /**
     * Inspect the equipment item and provide information about it.
     */
    public void inspect() {
        System.out.println("\nEquipment Overview:");

        System.out.println("Name: " + itemName);
        System.out.println("Weight: " + weight + " g");
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);

        if (weight >= 2000) {
            System.out.println("This gear is quite heavy.");
        } else if (weight < 2000 && weight > 500) {
            System.out.println("This equipment is not too heavy.");
        } else {
            System.out.println("This is light equipment, ideal for long hikes.");
        }

        if(price == 0){
            System.out.println("This equipment you got for free.");
        }
        else if (price > 600) {
            System.out.println("This equipment is quite expensive.");
        } else if (price <= 600 && price > 200) {
            System.out.println("This equipment is not too expensive.");
        } else {
            System.out.println("This equipment is available at a lower price.");
        }

        if (description.contains("rain protection")) {
            System.out.println("This equipment provides excellent protection against rain.");
        }
        if (description.contains("for safety")) {
            System.out.println("This equipment is perfect for safety.");
        }
        if (description.contains("easy to carry")) {
            System.out.println("This is compact equipment that is convenient to carry.");
        }
        if (description.contains("high-quality materials")) {
            System.out.println("This equipment is of very high quality and reliability.");
        }
        logToFile("Inspected equipment: " + itemName);
    }
}
