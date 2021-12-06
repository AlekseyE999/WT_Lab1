package by.bsuir.tasks.task8;

import java.util.Scanner;

public class SequenceCombiner {
	
    public static void main(String[] args) {
    	System.out.print("¬ведите размеры массивов:");
        Scanner scanner = new Scanner(System.in);
        int arraySizeA = scanner.nextInt();
        int arraySizeB = scanner.nextInt();
        double [] a = generateArray(arraySizeA);
        double [] b = generateArray(arraySizeB);
        shellSort(a);
        printArray(a);
        System.out.print("\n\n");
        shellSort(b);
        printArray(b);
        System.out.print("\n\n");
        scanner.close(); 
        combineSequences(a, b);
    }
    
    private static double[] generateArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++)
            array[i] = (int) (Math.random()*100)+1;
        return array;
    }
    
    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " "); 
        }
    }
    
    public static void shellSort(double[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                double tmp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > tmp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = tmp;
            }
        }
    }
    
	private static void combineSequences(double[] a, double[] b) {
		int i = 0;
        for (double element : b) {
            while (i < a.length) {
                if (element <= a[i]) {
                    break;
                }
                //System.out.printf("%d(from b) ", bEl);
                System.out.printf("%.1f ", a[i]);
                i++;
            }
            //System.out.printf("%d ", a[i]);
            System.out.printf("%.1f(from b) ", element);
        }

        while (i < a.length) {
            System.out.printf("%.1f ", a[i]);
            i++;
        }
	}
}
