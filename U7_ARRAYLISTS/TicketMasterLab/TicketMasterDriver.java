package U7_ARRAYLISTS.TicketMasterLab;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster t = new TicketMaster();
        t.loadFile("showData (1).txt");
        System.out.println(t);
    }
}
