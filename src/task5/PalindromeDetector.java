package task5;

public class PalindromeDetector {
            static boolean isPalindrome(int i) {
            int next = 0;
            int temp = i;

            while (temp != 0) {
                next = (next * 10) + (temp % 10);
                temp /= 10;
            }

            return i == next;
        }
    }

