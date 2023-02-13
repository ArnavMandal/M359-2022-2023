package U8_2DARRAYS.Examples;

public class Notes_8_2_MethodWriting {
    public static void main(String[] args) {
        int[][] myNums = { {9, 7, 25, 3}, {29, 8, 22, 10}, {19, 16, 9, 1}};
    showArray(myNums);

        System.out.println(getAvg(myNums));
    //2. output the avg of all #'s in myNumbs
        //3. find the number of rows that  contain at least one even #

        int evenRowCount = getEvenRowCount(myNums);
        System.out.println(evenRowCount);

        //4. find the number of columns that have an even #.
        int lol = getEvenColumnCount(myNums);
        System.out.println(lol);
    }
public static int getEvenColumnCount(int[][] arr){
        int even  = 0;
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] % 2 == 0) {
                    even++;

                }

            }
        }
        return even;
}
    public static double getAvg(int[][] arr){
        double sum = 0.0;
        int count = 0;
        for (int[] row: arr){
            for (int val: row){
                sum += val;
                count++;
            }
        }
        return sum/count;
    }
    public static void showArray(int[][] arr){
        for (int[] row: arr){
            for (int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int getEvenRowCount(int[][] arr){
      int even = 0;
        for (int[] row: arr){
            for (int val: row){
                if (val % 2 == 0){
                    even++;
                    break;
                }
            }
        }
        return even;
    }
}
