package U3_BOOLEAN_IF_STATEMENTS;

public class Pizza {
    // instance variables
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    public Pizza(String str, int in, int toppings, boolean deepDish){
        store = str;
        inches = in;
        numToppings = toppings;
        isDeepDish = deepDish;

    }
    public Pizza(String str, int in, boolean deepDish){
        store = str;
        inches = in;
        numToppings = 0;
        isDeepDish = deepDish;

    }
// printinfo method: print all info
    public void getInfo(){
        System.out.println("Pizza store: "+store+" inches: "+inches+" toppings: "+numToppings+" DeepDish: "+isDeepDish);
    }
    // toSting returns the pizza ina string/text format

    public String toString(){
        String output ="Pizza store: "+store+"\n inches: "+inches+"\n toppings: "+numToppings+"\n DeepDish: "+isDeepDish;
        return output;

    }
    public boolean equals(Pizza other) {
        if (this.inches == other.inches) {
            return true;
        } else {
            return false;
        }
    }
        public int compareTo(Pizza other){
            if(this.inches > other.inches){
                return -1;
            }else if(this.inches < other.inches){
                return 1;
            }else{
                return 0;
            }
        }

    public String getStore(){
        return store;
    }
    public void setStore(String newStore){
        store = newStore;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}
