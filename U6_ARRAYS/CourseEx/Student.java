package U6_ARRAYS.CourseEx;

public class Student {
    private String name;
    private Course[] myClasses;


    // full constuctor
    public Student(String name, Course[] myClasses){
        this.name = name;
        this.myClasses =new Course[8];
        for (int i  = 0; i < 8; i++){
            this.myClasses[i] = new Course(myClasses[i].getTeacherName(), myClasses[i].getSubject(),
                                            myClasses[i].getCurrentGrade(), myClasses[i].getPeriod());
        }
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
