package U9_INHERITANCE.Notes_9_3_9_4;

public class Shape {
    private String color;
    private int numSides;

    public Shape(String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }

    public Shape(){
        color = "No color";
        numSides = -1;
    }
}
