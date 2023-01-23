package U7_ARRAYLISTS.TicketMasterLab;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster t = new TicketMaster();
        t.loadFile("showData (1).txt");
        System.out.println(t);
        welcome();
        String choices = "1. Search by City\n";
        choices += "2. Sort by Performer (Z-A)\n";
        choices += "3. Sort by Performer (A-Z)\n";
        choices += "4. Sort by Price (low - high)\n";
        choices += "5. Sort by Price (high - low)\n";
        choices += "6. Quit";
        System.out.println(choices);

        System.out.println("Please enter a value between 1 and 6: ");

        while (true) {
            try {
                Scanner input = new Scanner(System.in); // done but need to do try catch
                int ans = input.nextInt();
                if (ans < 1 || ans > 6) {
                    throw new IllegalArgumentException("ERROR: Value must be between 1 and 6");
                // hello cat
                }
                break;
            } catch (Exception e){
                System.out.println("ERROR: Please enter a integer value.");

            }
           // System.out.println("You entered: " + ans);
        }

    }

    public static void welcome() {
        System.out.println("\t\t\t\t\t* WELCOME TO ARNAV'S TICKETMASTER *");
        System.out.println("\tYou may search our shows by city or sort by ticket price or performer");
        System.out.println("\t\tSimply select the correct option corresponding to your choice");
    }
}

