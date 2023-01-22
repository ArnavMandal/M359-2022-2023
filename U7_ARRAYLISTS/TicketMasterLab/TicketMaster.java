package U7_ARRAYLISTS.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {

    private ArrayList<Show> showsList = new ArrayList<>();

    public TicketMaster() {
        this.showsList = showsList;
    }
    public String toString(){
        String out = "";

        out += "Date\t\tPrice\tQty\t Performer\t\t\t\t City\t\n";
        out += "------------------------------------------------------------------------------\n";
        for (Show s: showsList){
            out += s.toString() + "\n";
        }
        return out;
    }
    public void loadFile(String name) throws FileNotFoundException {
        Scanner inFile = new Scanner(new File(name));

        while (inFile.hasNext()){
            String date = inFile.next();
            double price = inFile.nextDouble();
            int tickets = inFile.nextInt();
            String temp = inFile.nextLine();
            String artist = temp.substring(0, temp.indexOf(","));
            String loc = temp.substring(temp.indexOf(",") + 1);

            Show newShow = new Show(date, price, tickets, artist, loc);

            showsList.add(newShow);
        }
    }

}
