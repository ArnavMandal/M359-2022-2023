package U6_ARRAYS.CourseEx;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    // Full constructor
    public Course(String teacherName, String subject, String currentGrade, int period){
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }
    public Course( String subject, int period){
        this.teacherName = "N/A";
        this.subject = subject;
        this.currentGrade = "N/A";
        this.period = period;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    // Create a toString method that will return course info
    public String toString(){
        return "Teacher Name: " + this.teacherName + " Subject: " + this.subject + " Current Grade: " +
                this.currentGrade + " Period: " + this.period;
    }
}
