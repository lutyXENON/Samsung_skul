package modules.mod1._sec9.base;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class task2 {
    public static int SumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return (sum);
    }

    public static int SumOfSeven(int a, int b) {
        int sum = 0;
        for (int i = max(a, 10); i <= min(b, 99); i++) {
            if (i % 7 == 0)
                sum += SumOfDigits(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(SumOfSeven(a, b));
    }
}
