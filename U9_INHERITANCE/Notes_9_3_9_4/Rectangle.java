package U9_INHERITANCE.Notes_9_3_9_4;

public class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle(String color, int width, int length){
        super(color, 4);
        this.length = length;
        this.width = width;
    }
    public Rectangle(){
        super();
        width = -1;
        length = -1;
    }
}
