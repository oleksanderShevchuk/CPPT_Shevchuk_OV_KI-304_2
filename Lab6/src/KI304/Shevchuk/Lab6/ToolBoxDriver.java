package KI304.Shevchuk.Lab6;

import KI304.Shevchuk.Lab6.Tool;
import KI304.Shevchuk.Lab6.ToolBox;

import java.util.Comparator;
/**
 * The {@code KI304.Shevchuk.Lab6.ToolBoxDriver} class is a driver program to test the KI304.Shevchuk.Lab6.ToolBox class and its functionalities.
 */
public class ToolBoxDriver {
    public static void main(String[] args) {
        // Create a KI304.Shevchuk.Lab6.ToolBox to store tools
        ToolBox<Tool> toolBox = new ToolBox<>();

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + toolBox.isEmpty());

        // Add tools to the tool box
        toolBox.addTool(new Tool("Hammer"));
        toolBox.addTool(new Tool("Screwdriver"));
        toolBox.addTool(new Tool("Wrench"));

        // Display the tools in the tool box
        System.out.println("Tools in the toolbox:");
        for (Tool tool : toolBox.getTools()) {
            System.out.println(tool);
        }
        // Check if the stack is empty
        System.out.println("Is the stack empty? " + toolBox.isEmpty());
        // Find and display the maximum tool
        Comparator<Tool> toolComparator = new ToolComparator();
        Tool maxTool = toolBox.findMax(toolComparator);
        System.out.println("Maximum tool: " + maxTool);

        // Find and display the minimum tool
        Tool minTool = toolBox.findMin(toolComparator);
        System.out.println("Minimum tool: " + minTool);
    }
}
