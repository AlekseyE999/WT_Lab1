package task5;

import java.util.Scanner;

public class RemoveToMakeAscendingSequence 
{
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int arraySize = scanner.nextInt();
        int [] array = generateArray(arraySize);
        printArray(array);
        scanner.close();
        System.out.println("Минимальное количество элементов, которые можно удалить: "+elemsToRemove(array));
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = (int) (Math.random()*100)+1;
        return array;
    }
	    
    private static void printArray(int[] array) {
        System.out.print("Массив чисел: ");
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " "); 
        }
    }

    private static int elemsToRemove(int[] array){
        int[] tmpArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (array[j] < array[i]) {
                    tmpArray[i] = Math.max(tmpArray[i], 1 + tmpArray[j]);
                }
            }
        }
        int res = tmpArray[0];
        for (int i = 0; i < array.length; i++) {
            res = Math.max(res, tmpArray[i]);
        }
        return array.length - res;
    }
}
