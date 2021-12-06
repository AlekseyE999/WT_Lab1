package by.bsuir.tasks.task2;

import java.util.Scanner;

public class PointsChecker {
	
	 public static final int Y_TOP = 5;
	 public static final int Y_CENTRE = 0;
	 public static final int Y_BOTTOM = -3;
	 public static final int X_MAX = 6;
	 public static final int X_MIN = 4;

	 public static void main(String[] args) {
	     System.out.println("Введите значения X и Y: ");
	     Scanner scanner = new Scanner(System.in);
	     double x = scanner.nextDouble();
	     double y = scanner.nextDouble();
	     scanner.close();
	     System.out.println("Ответ: " + isPointOnArea(x, y));
	 }

	 private static boolean isPointOnArea(double x, double y) {
        boolean result = false;
        if ((isPointOnYTopPart(y)) && (Math.abs(x) <= X_MIN)) {
            result = true;
        } 
        else 
        	if (isPointOnYBottomPart(y) && (Math.abs(x) <= X_MAX)) {
            result = true;
        	}
        return result;
    }

    private static boolean isPointOnYTopPart(double y) {
        return (y <= Y_TOP) && (y > Y_CENTRE);
    }
    
    private static boolean isPointOnYBottomPart(double y) {
        return (y <= Y_CENTRE) && (y >= Y_BOTTOM);
    }  
}
