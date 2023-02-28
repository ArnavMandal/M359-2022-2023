package U9_INHERITANCE.Notes_9_3_9_4;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        radius = 0;
    }
    public Circle(String color, int numSides, double radius){
        super(color, numSides);
        this.radius = radius;
    }

}
