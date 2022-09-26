package U3_BOOLEAN_IF_STATEMENTS.ShoeCourseJUnitEx;

public class Course {
    private String classTitle;
    private int numStudentsEnrolled;
    private String teacherName;

    public Course(String classTitle, int numStudentsEnrolled, String teacherName) {
        this.classTitle = classTitle;
        this.numStudentsEnrolled = numStudentsEnrolled;
        this.teacherName = teacherName;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }

    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public boolean equals(Course other){
        if(this.classTitle.equals(other.classTitle) && this.numStudentsEnrolled == other.numStudentsEnrolled){
            return true;
        }else{
            return false;
        }
    }
    public int compareTo(Course other){
        if(this.classTitle.compareTo(other.classTitle) < 0){
            return -1;
        }else if(this.classTitle.compareTo(other.classTitle) > 0){
            return 1;
        }else{
            if(this.numStudentsEnrolled < other.numStudentsEnrolled){
                return -1;
            }else if(this.numStudentsEnrolled > other.numStudentsEnrolled){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
