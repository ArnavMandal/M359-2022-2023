package U4_LOOPS.PigLatinLab;



public class PigLatin {
    /**
     * This method takes a phrase with multiple words and returns a String with the phrase in pigLatin,
     * utilizing the translateWordToPigLatin method
     * @param str this is the sentence that you want translated into pig latin
     * @return returns the translated sentence
     */
    public static String toPigLatin(String str){
        /* We start with adding a space to the end of intput string,
        // and initializes a newSentence String which will be outputted
        at the end
        */
        str += " ";
        String newSentence = "";

        /*
           this loop first separates the String str into words, by chunking them
           based on the location of a space or " " and translates them using
           the translateWordToPigLatin method, adding that to the newSentence string.
           We then chop off the str after that space " " and repeat until there are no
           words lefts in the inout string.
         */

        while(str.length() != 0){

            newSentence += translateWordToPigLatin(str.substring(0, str.indexOf(" ")));

            newSentence += " ";

            str = str.substring(str.indexOf(" ") + 1);
        }


        // makes the first letter of the string uppercase and returns it

        newSentence = newSentence.substring(0, 1).toUpperCase() + newSentence.substring(1, newSentence.length() - 1);

        return newSentence;
    }

    /**
     *  this method translates a single string to pig latin and returns the translated string
     * @param str the word you want to translate
     * @return the translated word
     */
    public static String translateWordToPigLatin(String str){
        // this if statement checks if the input string starts with a vowel
        // if it does, we then add "yay" to the end and return the string
        if(vowelHelper(str)){
            str += "yay";
            return str.toLowerCase();
        }

        /* if the string doesn't start with a vowel the method loops and moves
         each subsequent letter to the end of the string until a vowel
         shows up */
        else{
            for (int i = 0; i < str.length(); i++){
                if(!vowelHelper(str)){

                    str = str.substring(1) + str.substring(0, 1);
                }
            }
            str += "ay";

            return str.toLowerCase();
        }


}

    /**
     * This helper method checks if a String starts with a vowel
     * @param word this is the String that is being checked
     * @return returns a boolean value of true or false if the word starts with
     * a vowel
     */
    // test hello cat
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