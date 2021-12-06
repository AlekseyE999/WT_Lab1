package task9;

import java.awt.*;

public class Ball {
	
    private Color color;
    private int weight;

    public Ball(Color color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String ballInfo() {
        String colorString = color == Color.BLUE? "blue" : "red";
        return "color: " + colorString + ", weight: " + weight;
    }
}
