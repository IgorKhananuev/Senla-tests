package task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordRepetitionCounter {
    static int wordCounter(String text, String word) {
        if (word.equals("") || text.equals("")) throw new IllegalArgumentException("Не верный ввод слова");

        text = text.toLowerCase();
        word = word.toLowerCase();

        int wordCount = 0;
        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

        while (matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }
}
