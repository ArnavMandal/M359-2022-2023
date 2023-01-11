package U6_ARRAYS.CourseEx;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingEx {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("studentScheduleData.txt");
        Scanner fileIn = new Scanner(myFile);
        // first line should be the # of students
        int numStudents = fileIn.nextInt();
        fileIn.nextLine(); // dummy read
        // create an array of student objs
        Student[] myStudents = new Student[numStudents];
        // First, read in student's name

        for (int j = 0; j < numStudents; j++) {

            String stName = fileIn.nextLine();

            Course[] sched = new Course[8];

            for (int i = 0; i < 8; i++) {

                String teacherName = fileIn.nextLine();

                String className = fileIn.nextLine();

                String letterGrade = fileIn.nextLine();

                int periodNum = fileIn.nextInt();

                if (fileIn.hasNextLine()) {

                    fileIn.nextLine();                   //dummy read to clear newLine after #
                }

                Course myCourse = new Course(teacherName, className, letterGrade, periodNum);

                sched[i] = myCourse;
            }
            // now we know the students name and course, we can create the obj

            Student curStudent = new Student(stName, sched);

            myStudents[j] = curStudent;
        }

        for (Student c: myStudents){

            System.out.println(c);
        }
        // hello cat
    }
}
