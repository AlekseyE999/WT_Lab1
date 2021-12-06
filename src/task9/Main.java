package task9;

import java.awt.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведите количество м€чей:\n");
        int size = scanner.nextInt();
        scanner.close();
        Basket basket = new Basket();
        for (int i = 0; i < size; i++){
            int weight = (int) (Math.random()*100) + 20;
            Color color = (int) (Math.random()*10) % 2 == 1 ? Color.BLUE : Color.RED;
            basket.addBall(new Ball(color, weight));
        }
        System.out.println("\nTotal weight: " + basket.getTotalWeight());
        System.out.println("Amount  of blue balls: " + basket.getCountOfBlueBalls(Color.BLUE));

    }
}

//task10
//javac -d binTask10  ./src/task9/*.java
//java -classpath binTask10 task9.Main

//task11
//jar cfe task11.jar task9.Main .
//java -jar task11.jar