package KI304.Shevchuk.Lab6;

import KI304.Shevchuk.Lab6.Tool;

import java.util.Comparator;
/**
 * The {@code KI304.Shevchuk.Lab6.ToolComparator} class is a comparator for comparing KI304.Shevchuk.Lab6.Tool objects based on their names.
 */
public class ToolComparator implements Comparator<Tool> {
    @Override
    public int compare(Tool tool1, Tool tool2) {
        return tool1.getName().compareTo(tool2.getName());
    }
}
