package U2_OBJECTS;

public class Student {
    // Instance variables
    private String name;
    private double gpa;
    private int gradeLevel;

    // Constructor
    public Student(String stName, int stGradeLevel, double stGpa){
        name = stName;
        gradeLevel = stGradeLevel;
        gpa = stGpa;


    }


    public Student(String stName){
        name = stName;
        gradeLevel =  9;
        gpa = -1;
    }

    //Methods
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + gradeLevel);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public void setGradeLevel(int newGradeLevel){
        gradeLevel = newGradeLevel;

    }

    public int getGradeLevel(){
        return gradeLevel;
    }
}
