package by.bsuir.tasks.task7;

import java.util.Scanner;

public class ShellSorter {
	
    public static void main(String[] args) {
        System.out.print("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int [] array = generateArray(arraySize);
        printArray(array);
        scanner.close();
        System.out.print("\n\n");
        shellSort(array);
        System.out.println("Отсортированный массив: ");
        printArray(array);
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
    
    public static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int tmp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > tmp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = tmp;
            }
        }
    }
}
