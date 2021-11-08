package modules.mod1._sec9.base;

import java.util.Scanner;

public class task3 {
    public static int SumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int SumOfThirteen(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (SumOfDigits(i) % 13 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(SumOfThirteen(n));
    }
}
