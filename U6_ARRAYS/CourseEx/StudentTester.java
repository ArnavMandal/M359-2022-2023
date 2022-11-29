package U6_ARRAYS.CourseEx;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("Newby", "Gym", "A+", 1);
        Course per2 = new Course("Higgins", "AP Calculus BC", "B", 2);
        Course per3And4 = new Course("Zimolzak", "AP Physics", "B", 3);
        Course per5 = new Course("Lunch", 5);
        Course per6 = new Course("Ganas", "AP Psych", "A", 6);
        Course per7 = new Course("Moon", "APCSA", "A", 7);
        Course per8 = new Course("Christensen","AP Lang", "A", 8 );
        Course[] sched = {per1, per2, per3And4, per5, per6, per7, per8};
        Student s1 = new Student("Arnav", sched);
        System.out.println(s1);


    }
}
