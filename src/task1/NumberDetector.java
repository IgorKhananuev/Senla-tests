package task1;

public class NumberDetector {

    static void numberIsOddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Это четное число");
        } else
            System.out.println("Это нечетное число");
    }

    static String numberIsSimpleOrComposite(int n) {
            if (n < 2) {
                return "Для проверки введите число больше 2";
            }
            for (int i = 2; i*i <= n; i++) {
                if (n % i == 0)
                    return "Это составное число";
            }
            return "Это простое число";
        }
}





