package KI304.Shevchuk.Lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * The {@code KI304.Shevchuk.Lab6.ToolBox<T>} class represents a toolbox that stores items of type T.
 * @param <T> The type of items to be stored in the toolbox.
 */
public class ToolBox<T> {
    private List<T> items;
    /**
     * Constructs an empty toolbox.
     */
    public ToolBox() {
        this.items = new ArrayList<>();
    }
    /**
     * Adds an item to the toolbox.
     * @param item The item to add.
     */
    public void addTool(T item) {
        items.add(item);
    }
    /**
     * Gets the list of items in the toolbox.
     * @return The list of items.
     */
    public List<T> getTools() {
        return items;
    }
    /**
     * Checks if the toolBox is empty.
     * @return true if the toolBox is empty, false otherwise.
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }
    /**
     * Finds the maximum item in the toolbox based on the provided comparator.
     * @param comparator The comparator to determine the maximum.
     * @return The maximum item.
     */
    public T findMax(Comparator<T> comparator) {
        if (isEmpty()) {
            return null;
        }
        T maxItem = items.get(0);
        for (T item : items) {
            if (comparator.compare(item, maxItem) > 0) {
                maxItem = item;
            }
        }
        return maxItem;
    }
    /**
     * Finds the minimum item in the toolbox based on the provided comparator.
     * @param comparator The comparator to determine the minimum.
     * @return The minimum item.
     */
    public T findMin(Comparator<T> comparator) {
        if (isEmpty()) {
            return null;
        }
        T minItem = items.get(0);
        for (T item : items) {
            if (comparator.compare(item, minItem) < 0) {
                minItem = item;
            }
        }
        return minItem;
    }
}
