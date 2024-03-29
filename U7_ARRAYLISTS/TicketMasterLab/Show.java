package U7_ARRAYLISTS.TicketMasterLab;

public class Show {
    private String date;

    private double price;

    private int qty;

    private String performer;

    private String city;

    public Show(String date, double price, int qty, String performer, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.performer = performer;
        this.city = city;
    }

    /**
     * formats a show object into a nicely formatted String
     * @return String of show object
     */
    public String toString(){
        String out = "";
        out += this.date + "\t" + this.price + "\t" + this.qty + "\t" + spacer(this.performer)+ "\t" + this.city + "\t";
        return out;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    // <=6, <=9, <=11, <=15 goes from 5 tabs to 2

    /**
     * helper method meant to help the toString space the names of
     * performers consistently based on the length of their name
     * @param name name of performer
     * @return extra spacing with the String of the name
     */
    public String spacer(String name){
        if(name.length() <= 7){
            return name + "\t\t\t\t";
        }else if (name.length() <= 9){
            return name + "\t\t\t";
        }else if (name.length() <= 11){
            return name + "\t\t\t";
        }else if (name.length() <= 15){
            return name + "\t\t";
        }
        else {
            return name + "\t";
        }
    }
}
