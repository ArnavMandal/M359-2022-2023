package U3_BOOLEAN_IF_STATEMENTS;

public class CompoundBoolensEx {
    public static void main(String[] args) {
        String day = "Monday";
        int numAssignments = 2;

        if(day.equals("Saturday") || numAssignments == 0){
            System.out.println("Yay, video games!");
        }else{
            System.out.println("I guess I'll have to wait");
        }

        //Bob goes to club only if its onday and he has less than 2 assignments.

        if(day.equals("Monday") && numAssignments <= 2){
            System.out.println("Yay, Coding club!");
        }else{
            System.out.println("Today is a sad day.");
        }

        //3. he alsways plays on the weekends, on the weekdays
        // she exercizes with 80% probablitiy if she has now homeworks,
        // but only with 3-0% probabiltiy.
        if (day.equals("Saturday")||day.equals("Sunday")) {
            System.out.println("Exercise");
        }
        else{   // mean not weekend, aka weekday
            int rand = (int)(Math.random()*10)+1;
            if(numAssignments == 0) {
                // 80%
                if (rand <= 8){
                    System.out.println("Exercise");
                }else{
                    System.out.println("No Exercise");
                }
            }
            else{
                // 30%
                if(rand <= 3){
                    System.out.println("Exercise");
                }else{
                    System.out.println("No Exercise");
                }
            }
        }






    }
    }

