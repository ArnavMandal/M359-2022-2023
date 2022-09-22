package U3_BOOLEAN_IF_STATEMENTS;

public class Review {
    private String name;
    private String resturant;
    private int rating;

    public Review(String name, String resturant, int rating){
        this.name = name;
        this.resturant = resturant;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResturant() {
        return resturant;
    }

    public void setResturant(String resturant) {
        this.resturant = resturant;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public String toString(){
      String newString = name+", "+resturant+", "+rating;
      if(rating == 5){
          newString += "\n\t** Highly Recommended";
      }else if(rating == 1){
          newString += "\n\t** Strongly Discouraged";
      }
      return newString;
    }
}
