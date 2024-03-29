package U7_ARRAYLISTS.TicketMasterLab;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TicketMasterDriver {
    static Scanner input = new Scanner(System.in);

    final static int SEARCH_BY_CITY = 1;

    final static int SORT_BY_PERFORMERZA = 2;

    final static int SORT_BY_PERFORMERAZ = 3;

    final static int SORT_BY_PRICE_LOW_HIGH = 4;

    final static int SORT_BY_PRICE_HIGH_LOW = 5;

    final static int QUIT = 6;

    static TicketMaster t = new TicketMaster();
    static String userCity = "";
    public static void main(String[] args) throws FileNotFoundException {
        t.loadFile("showData (1).txt");
        System.out.println(t);
        welcome();
        validateInput();



    }

    /**
     * welcome method to greet the user when opening the ticketmaster.
     * returns nothing
     */
    public static void welcome() {
        System.out.println("\t\t\t\t\t* WELCOME TO ARNAV'S TICKETMASTER *");
        System.out.println("\tYou may search our shows by city or sort by ticket price or performer");
        System.out.println("\t\tSimply select the correct option corresponding to your choice");
    }

    /**
     * helper method that gets the user to the menu of choices and checks user input
     * to make  sure it fits criteria (1 - 6), and then performs the action based on the
     * input.
     */
    public static void validateInput(){

        int choice = 0;

        boolean isDone = false;

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
                if (choice < 0 || choice > 6){
                    System.out.println("Please enter a value between 1 and 6.");

                }

            } catch (InputMismatchException e){
                System.out.println("ERROR: Please enter a integer value.");
                input.nextLine();

            }

            if (choice == SEARCH_BY_CITY){
                System.out.println("Enter city name: ");
                userCity = input.nextLine();
                t.searchByCity(userCity);
                System.out.println("");
                welcome();
                System.out.println(choices);
            }

            if(choice == SORT_BY_PERFORMERZA){
                t.sortPerformerZA(t.getShowsList());
                System.out.println("");
                welcome();
                System.out.println(choices);
            }

            if (choice == SORT_BY_PERFORMERAZ){
                t.sortPerformerAZ(t.getShowsList());
                System.out.println("");
                welcome();
                System.out.println(choices);
            }
            if (choice == SORT_BY_PRICE_LOW_HIGH){
                t.sortByPrice(t.getShowsList(), true);

                System.out.println("");
                welcome();
                System.out.println(choices);
            }
            if (choice == SORT_BY_PRICE_HIGH_LOW){
                t.sortByPrice(t.getShowsList(), false);

                System.out.println("");
                welcome();
                System.out.println(choices);
            }
            if (choice == QUIT){
                isDone = true;
                System.out.println("Thanks for using Arnav's Ticketmaster!\nWe hope to see you again!");
                input.close();
            }
        }

    }

}

