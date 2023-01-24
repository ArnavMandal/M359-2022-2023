package U7_ARRAYLISTS.TicketMasterLab;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        int choice = 0;

        boolean isDone = false;

        Scanner input = new Scanner(System.in);
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

        while (!isDone) {
            try {
                choice = input.nextInt();
                input.nextLine();
                if (choice < 7 && choice > 0){
                    isDone = true;

                } else {
                    System.out.println("Please enter a value between 1 and 6.");

                }

            } catch (InputMismatchException e){
                System.out.println("ERROR: Please enter a integer value.");
                input.nextLine();

            }

        }
        System.out.println("You entered: " + choice);


    }

    public static void welcome() {
        System.out.println("\t\t\t\t\t* WELCOME TO ARNAV'S TICKETMASTER *");
        System.out.println("\tYou may search our shows by city or sort by ticket price or performer");
        System.out.println("\t\tSimply select the correct option corresponding to your choice");
    }
}

