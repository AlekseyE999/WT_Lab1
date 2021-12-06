package task3;

import java.util.Scanner;

public class FunctionCalculator {
	
    public static void main(String[] args) {
        System.out.println("Введите крайние значения отрезка a и b и шаг h: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        scanner.close();
        FunctionValues(a, b, h);
    }

    private static void FunctionValues(double a, double b, double h) {
        if (a > b) {
            System.out.println("Invalid range");
        } 
        else {
            displayTable(a, b, h);
        }
    }

    private static void displayTable(double a, double b, double h) {
        double f;
        System.out.println("x        f(x)");
        while (a < b) {
            f = Math.tan(a);
            System.out.printf("%.3f    %.3f \n", a, f);
            a = a + h;
        }
        f = Math.tan(b);
        System.out.printf("%.3f    %.3f \n", b, f);
    }
}
