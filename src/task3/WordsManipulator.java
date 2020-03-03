package task3;

public class WordsManipulator {

    static int wordsCalculator(String string) {
        int wordQuantity = string.trim().split(" +").length;
        ;
        return wordQuantity;
    }


    static String firstKeyToUpperCase(String string) {
        String upperСaseString = "";
        upperСaseString = upperСaseString + string.substring(0, 1).toUpperCase();
        for (int i = 1; i < string.length(); i++) {
            if (" ".equals(string.substring(i - 1, i))) {
                upperСaseString = upperСaseString + string.substring(i, i + 1).toUpperCase();
            }
            else
                upperСaseString = upperСaseString + string.substring(i, i + 1);
        }
        return upperСaseString;
    }
}


