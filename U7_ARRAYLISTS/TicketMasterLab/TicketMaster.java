package U7_ARRAYLISTS.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
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
            String artist = temp.substring(1, temp.indexOf(","));
            String loc = temp.substring(temp.indexOf(",") + 2);

            Show newShow = new Show(date, price, tickets, artist, loc);

            showsList.add(newShow);
        }
    }

    public void searchByCity(String userCity){
        for (int i = 0; i < showsList.size(); i++){
            if(showsList.get(i).getCity().equalsIgnoreCase(userCity)){
                System.out.println(showsList.get(i).toString());
            }
        }
    }

    public void sortPerformerZA(ArrayList<Show> list){
        for (int i = 0; i < list.size() - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j).getPerformer().compareTo(list.get(minIndex).getPerformer()) > 0){
                    minIndex = j;
                }
            }
            Show temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
        for (int k = 0; k < list.size(); k++){
            System.out.println(list.get(k));
        }
    }
    public void sortPerformerAZ(ArrayList<Show> list){
        for (int i = 0; i < list.size() - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j).getPerformer().compareTo(list.get(minIndex).getPerformer()) < 0){
                    minIndex = j;
                }
            }
            Show temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
        for (int k = 0; k < list.size(); k++){
            System.out.println(list.get(k));
        }
    }

    public void sortByPrice(ArrayList<Show> list){
        for (int i = 1; i < list.size(); i++){
            double valueToInsert = list.get(i).getPrice();

            // find the right index to insert this to
            int pos = i;
            while (pos > 0 && list.get(pos - 1).getPrice() > valueToInsert){
                list.set(pos, list.get(pos - 1));   // shifts left

                pos--;
            }
            // at this point, "pos" identitifes the index
            // where valueToInsert should go to:
            list.get(pos).setPrice(valueToInsert);
        }
        for (int k = 0; k < list.size(); k++){
            System.out.println(list.get(i));
        }
    }



    public ArrayList<Show> getShowsList() {
        return showsList;
    }
}
