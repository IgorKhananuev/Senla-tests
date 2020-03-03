package task4;

/*
Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
        Текст и слово вводится вручную.
*/

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println("Количество повторений слов в введенном техте = " +
                WordRepetitionCounter.wordCounter(text,word));
    }
}
