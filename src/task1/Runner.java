package task1;

import java.util.Scanner;

/*
Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным,
простым или составным.  Если пользователь введёт не целое число, то сообщать ему об ошибке.
*/

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки на четность/нечетность");
        NumberDetector.numberIsOddOrEven(scanner.nextInt());
        System.out.println("\nВведите число для проверки - составное оно или нет");
        System.out.println(NumberDetector.numberIsSimpleOrComposite(scanner.nextInt()));
        scanner.close();
        }
    }


