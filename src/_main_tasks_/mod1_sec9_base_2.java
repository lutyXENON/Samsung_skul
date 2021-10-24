package _main_tasks_;

import java.util.Scanner;

public class mod1_sec9_base_2 {
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
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0)
                sum += SumOfDigits(i);
        }
        return (sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(SumOfSeven(a, b));
    }
}
