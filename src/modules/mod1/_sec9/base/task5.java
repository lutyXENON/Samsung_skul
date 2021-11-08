package modules.mod1._sec9.base;

import java.util.Scanner;

public class task5 {
    public static int SumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static double avgOf4Digit(int[] m) {
        double sum = 0, counter = 0;
        for (int i : m) {
            if (1000 <= i && i < 10_000) {
                sum += i;
                counter++;
            }
        }
        if (counter == 0) return -1.0;
        return sum / counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = in.nextInt();
        }
        System.out.println(avgOf4Digit(m));
    }
}