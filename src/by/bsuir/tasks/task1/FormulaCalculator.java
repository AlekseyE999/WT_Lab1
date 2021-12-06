package task1;

import java.util.Scanner;

public class FormulaCalculator {
	
	public static void main(String[] args) {
        System.out.println("Введите значения X и Y: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();
        System.out.println("Значение выражения равно " + calculateFormulaValue(x, y));
    }

    private static double calculateFormulaValue(double x, double y) {
        double numerator = calculateNumerator(x, y);
        double denominator = calculateDenominator(x, y);
        return (numerator / denominator + x);
    }

    private static double calculateNumerator(double x, double y) {
        double sinusSum = Math.sin(x + y);
        return (1 + sinusSum * sinusSum);
    }

    private static double calculateDenominator(double x, double y) {
        double denominatorOfDenaminator = 1 + x*x * y*y;
        double moduleExpression = x - 2 * x / denominatorOfDenaminator;
        return (2 + Math.abs(moduleExpression));
    }
}
