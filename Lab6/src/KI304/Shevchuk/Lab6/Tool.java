package KI304.Shevchuk.Lab6;

/**
 * The {@code KI304.Shevchuk.Lab6.Tool} class represents a tool.
 */
public class Tool {
    private String name;
    /**
     * Constructs a tool with the specified name.
     * @param name The name of the tool.
     */
    public Tool(String name) {
        this.name = name;
    }
    /**
     * Gets the name of the tool.
     * @return The name of the tool.
     */
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "KI304.Shevchuk.Lab6.Tool {" +
                " Name='" + name + '\'' +
                " }";
    }
}
