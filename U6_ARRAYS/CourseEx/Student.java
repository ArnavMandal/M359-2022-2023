package U6_ARRAYS.CourseEx;

public class Student {
    private String name;
    private Course[] myClasses;


    // full constuctor
    public Student(String name, Course[] myClasses){
        this.name = name;
        this.myClasses = myClasses;
    }
    // Write toString method that displays info of name and courses
    public String toString(){
        String output = this.name + "\n";
        for(int i = 0; i < myClasses.length; i++){
            output += myClasses[i];
        }
        return output;
    }




}
