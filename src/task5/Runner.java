package task5;

import java.util.Scanner;

/*
Создать программу, которая в последовательности от 0 до N, находит все числа-палиндромы
(зеркальное значение равно оригинальному). Длина последовательности N вводится вручную и не должна превышать 100.
*/


public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите последовательность чисел от 0 до 100");
        int n = in.nextInt();
        if (!(n < 0 || n > 100)) {
            for (int i = 0; i < n + 1; i++) {
                if (PalindromeDetector.isPalindrome(i)) System.out.print(i + " ");
            }
        } else {
            System.out.println("Число должно быть от  0 до 100.");
        }
    }
}

