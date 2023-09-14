package KI304.Shevchuk.Lab4;

/**
 * The {@code ExpressionCalculator} class calculates the result of a given mathematical expression.
 */
public class ExpressionCalculator {
    /**
     * Calculates the result of the expression y = sin(x - 9) / (x - cos(2x)).
     *
     * @param x The value of x in the expression.
     * @return The calculated result y.
     */
    public static double calculateExpression(double x) {
        // Calculate the expression y
        double numerator = Math.sin(x - 9);
        double denominator = x - Math.cos(2 * x);

        // Check for division by zero
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return numerator / denominator;
    }
}
