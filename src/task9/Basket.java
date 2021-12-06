package task9;

import java.awt.*;
import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> balls = new ArrayList<>();

    public void addBall(Ball ball){
        balls.add(ball);
        System.out.println("ћ€ч добавлен - " + ball.ballInfo());
    }

    public int getTotalWeight(){
        int totalWeight = 0;
        for (Ball ball : balls){
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int getCountOfBlueBalls(Color color){
        int count = 0;
        for (Ball ball : balls){
            if (ball.getColor() == Color.BLUE)
                count++;
        }
        return count;
    }
}
