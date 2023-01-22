package U7_ARRAYLISTS.TicketMasterLab;

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

    }

    public static void welcome() {
        System.out.println("\t\t\t\t\t* WELCOME TO ARNAV'S TICKETMASTER *");
        System.out.println("\tYou may search our shows by city or sort by ticket price or performer");
        System.out.println("\t\tSimply select the correct option corresponding to your choice");
    }
}

