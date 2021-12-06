package by.bsuir.tasks.task4;

import java.util.Scanner;

public class FindPrimeNumbers {
	
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int [] array = generateArray(arraySize);
        printArray(array);
        scanner.close();
        printIndexesOfPrimeNumbers(array);
    }
    
    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = (int) (Math.random()*100)+1;
        return array;
    }
    
    private static void printIndexesOfPrimeNumbers(int[] arr) {
        System.out.print("Индексы простых чисел: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(i + " ");
            }
        }
    }
    
    private static void printArray(int[] array) {
        System.out.print("Массив чисел: ");
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " "); 
        }
    }

    private static boolean isPrime(int n) {
    	if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
