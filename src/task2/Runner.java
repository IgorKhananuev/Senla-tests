package task2;

import java.util.Scanner;

/*Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и НОД
(наибольший общий делитель) двух целых чисел, введенных пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.*/

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычисляем НОК (наименьшее общее кратное) ");
        System.out.println(NumberDetector.leastCommonMultipler(scanner.nextInt(), scanner.nextInt()));
        System.out.println("Вычисляем НОК (наибольший общий делитель) ");
        System.out.println(NumberDetector.greatestCommonDivider(scanner.nextInt(), scanner.nextInt()));


    }
}
