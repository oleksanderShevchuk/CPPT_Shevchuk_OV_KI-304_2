package KI304.Shevchuk.Lab4;

/**
 * The {@code ExpressionCalculator} class calculates the result of a given mathematical expression.
 */
public class ExpressionCalculator {

    /**
     * Calculates the result of the expression y = sin(x - 9) / (x - cos(2x)).
     * @param x The value of x in the expression.
     * @return The calculated result y.
     * @throws ArithmeticException if division by zero or very close to zero occurs.
     */
    public static double calculateExpression(double x) throws ArithmeticException {
        // Check if the denominator (x - cos(2x)) is close to zero
        double numerator = Math.sin(x - 9);
        double denominator = x - Math.cos(2 * x);

        // Check if the denominator is very close to zero
        if (Math.abs(denominator) < 1e-10) {
            throw new ArithmeticException("Division by zero or very close to zero.");
        }
        // Check if the numerator is zero
        else if (numerator == 0) {
            throw new ArithmeticException("Division with zero in the numerator.");
        }

        // Calculate the expression
        return numerator / denominator;
    }
}
