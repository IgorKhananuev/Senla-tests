package task3;

/*Создать программу, которая будет:
        подсчитывать количество слов в предложении;
        выводить их в отсортированном виде;
        делать первую букву каждого слова заглавной;
        Предложение вводится вручную. (Разделитель пробел (“ ”)).*/


import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("Количество слов в введенной строке = " + WordsManipulator.wordsCalculator(string));
        System.out.println("Первые буквы слов переведены в верхний регистр "
                + WordsManipulator.firstKeyToUpperCase(string));



    }


}
