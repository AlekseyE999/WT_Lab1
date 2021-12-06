package by.bsuir.tasks.task6;

import java.util.Scanner;

public class SquareMatrixCreator {
	
	public static void main(String[] args) {
        System.out.print("¬ведите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int [] array = generateArray(arraySize);
        printArray(array);
        System.out.print("\n\n");
        scanner.close();
        createMatrix(array);
    }
	
	private static void createMatrix(int[] array) {
        int[][] squareMatrix = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array, 0, squareMatrix[i], 0, array.length);
            cyclicShift(array);
        }
        writeMatrix(array.length, squareMatrix);
    }
	
    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = (int) (Math.random()*100)+1;
        return array;
    }
    
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " "); 
        }
    }

    private static void cyclicShift(int[] array) {
        int buf = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = buf;
    }

    private static void writeMatrix(int n, int[][] matrix) {
    	System.out.print(" вадратна€ матрица:\n");
        for (int i = 0; i < n; i++) {
           printArray(matrix[i]);
           System.out.print("\n");
        }
    }
}
