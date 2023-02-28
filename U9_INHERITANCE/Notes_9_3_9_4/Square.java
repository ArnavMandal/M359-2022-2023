package U9_INHERITANCE.Notes_9_3_9_4;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(int sideLength, String color){
        super(color, sideLength, sideLength);
    }
}
