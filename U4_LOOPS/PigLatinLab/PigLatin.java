package U4_LOOPS.PigLatinLab;

import java.util.Locale;

public class PigLatin {


    public static String translateWordToPigLatin(String str){
        // In case there is a vowel at the start, add "yay" to the end
        // and return the String
        if(str.substring(0, 1).equalsIgnoreCase("a") ||
           str.substring(0, 1).equalsIgnoreCase("e") ||
           str.substring(0, 1).equalsIgnoreCase("i") ||
           str.substring(0, 1).equalsIgnoreCase("o") ||
           str.substring(0, 1).equalsIgnoreCase("u")){

            str+="yay";
            return str;
        }else{

            String consonant = "";

            for(int i = 0; i < str.length(); i++){
                if(str.substring(i, i+1).equalsIgnoreCase("a") ||
                        str.substring(i, i+1).equalsIgnoreCase("e") ||
                        str.substring(i, i+1).equalsIgnoreCase("i") ||
                        str.substring(i, i+1).equalsIgnoreCase("o") ||
                        str.substring(i, i+1).equalsIgnoreCase("u")){
                    consonant = str.substring(0, i);
                    str = str.substring(i) + consonant + "ay";
                    return str;
                }else{
                return str;
                }
            }
        }
    }
}
