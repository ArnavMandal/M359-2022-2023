package U7_ARRAYLISTS.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {

    private ArrayList<Show> showsList = new ArrayList<>();

    public TicketMaster(ArrayList<Show> showsList) {
        this.showsList = showsList;
    }
    public String toString(){
        String out = "";

        out += "Date\t\tPrice\t\tQty\tPerformer\t\t\t\tCity\t\n";
        out += "------------------------------------------------------------------------------";
        for (Show s: showsList){
            out += s.toString() + "\n";
        }
        return out;
    }
    public void loadFile(String name) throws FileNotFoundException {
        Scanner inFile = new Scanner(new File(name));

    }

}
