package U6_ARRAYS.CourseEx;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingEx {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("oneSchedule.txt");
        Scanner fileIn = new Scanner(myFile);

        // First, read in student's name

        String stName = fileIn.nextLine();
        Course[] sched = new Course[8];
        for (int i = 0; i < 8; i++) {
            String teacherName = fileIn.nextLine();
            String className = fileIn.nextLine();
            String letterGrade = fileIn.nextLine();
            int periodNum = fileIn.nextInt();
            if (fileIn.hasNextLine()){
                fileIn.nextLine();                   //dummy read to clear newLine after #
            }

            Course myCourse = new Course(teacherName, className, letterGrade, periodNum);
            sched[i] = myCourse;
        }
        for (Course c: sched){
            System.out.println(c);
        }
    }
}
