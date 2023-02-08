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

    /**
     * toString function used to format the list of shows into easily readable string
     * @return string of show list
     */
    public String toString(){
        String out = "";

        out += "Date\t\tPrice\tQty\t Performer\t\t\t\t City\t\n";
        out += "------------------------------------------------------------------------------\n";
        for (Show s: showsList){
            out += s.toString() + "\n";
        }
        return out;
    }

    /**
     * void method used in the beginning of the driver class in order to
     * read the text file containing the shows and inserting them into a
     * arraylist of show objects
     * @param name name of .txt file
     * @throws FileNotFoundException
     */
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

    /**
     * the linear search method to traverse the arraylist to find
     * shows in user inputted city. Corresponds to user input 1. if theres
     * no shows in that city, prints out a message to let user know.
     * @param userCity city user wants to search for.
     */
    public void searchByCity(String userCity){
        int count = 0;
        for (int i = 0; i < showsList.size(); i++){
            if(showsList.get(i).getCity().equalsIgnoreCase(userCity)){
                System.out.println(showsList.get(i).toString());
                count++;
            }
            }
        if(count == 0)
            System.out.println("There are no shows available in " + userCity);
        }


    /**
     * void method to sort the shows be performers Z-A using selection sort method,
     * corresponds to user input 2.
     * @param list list of shows
     */
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

    /**
     * void method used to sort the list of shows alphabetically from A-Z, corresponds to user
     * input 3
     * @param list list of shows
     */
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

    /**
     * void method used to sort the list of shows by price using insertion
     * sort and printing them out from low to high or high to low depending
     * on if user inputted 4 or 5.
     * @param list list of shows
     * @param high boolean value to indicate whether the last value is the highest
     *             indicating low-high pricing
     */
    public void sortByPrice(ArrayList<Show> list, boolean high){
        for (int i = 1; i < list.size(); i++){
            double valueToInsert = list.get(i).getPrice();
            Show showToInsert = list.get(i);
            // find the right index to insert this to
            int pos = i;
            while (pos > 0 && list.get(pos - 1).getPrice() > valueToInsert){
                list.set(pos, list.get(pos - 1));   // shifts left

                pos--;
            }
            // at this point, "pos" identifies the index
            // where valueToInsert should go to:
            list.set(pos, showToInsert);
        }

        if (high) {
            for (int k = 0; k < list.size(); k++) {
                System.out.println(list.get(k));
            }
        }else{
            for (int n = list.size() - 1; n >= 0; n--){
                System.out.println(list.get(n));
            }
        }
    }


    public ArrayList<Show> getShowsList() {
        return showsList;
    }
}
