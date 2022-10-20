package U4_LOOPS.PigLatinLab;



public class PigLatin {
    /**
     * This function takes a phrase with multiple words and returns a String with the phrase in pigLatin
     * @param str
     * @return
     */
    public static String toPigLatin(String str){

        str += " ";
        String newSentence = "";

        while(str.length() != 0){
            newSentence += translateWordToPigLatin(str.substring(0, str.indexOf(" ")));
            newSentence += " ";
            str = str.substring(str.indexOf(" ") + 1);
        }
        newSentence = newSentence.substring(0, 1).toUpperCase() + newSentence.substring(1, newSentence.length() - 1);
        return newSentence;
    }
    public static String translateWordToPigLatin(String str){
        if(vowelHelper(str)){
            str += "yay";
            return str.toLowerCase();
        }else{
            for (int i = 0; i < str.length(); i++){
                if(!vowelHelper(str)){
                    str = str.substring(1) + str.substring(0, 1);
                }
            }
            str += "ay";
            return str.toLowerCase();
        }
}

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