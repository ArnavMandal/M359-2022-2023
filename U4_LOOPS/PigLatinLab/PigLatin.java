package U4_LOOPS.PigLatinLab;



public class PigLatin {

    public static String translateWordToPigLatin(String str){
        if(vowelHelper(str)){
            str += "yay";
            str.toLowerCase();
            return str;
        }else{
            for (int i = 0; i < str.length(); i++){
                if(!vowelHelper(str)){
                    str = str.substring(1) + str.substring(0, 1);
                }
            }
            str += "ay";
            str.toLowerCase();
            return str;
        }
}
/*
public static String toPigLatin(String str){
        String sentence = str.toLowerCase();
        String temp = "";

}
*/

public static boolean vowelHelper(String word){
    if     (word.substring(0, 1).equalsIgnoreCase("a") ||
            word.substring(0, 1).equalsIgnoreCase("e") ||
            word.substring(0, 1).equalsIgnoreCase("i") ||
            word.substring(0, 1).equalsIgnoreCase("o") ||
            word.substring(0, 1).equalsIgnoreCase("u")){
            return true;

    }else{
            return false;
    }
    }
}