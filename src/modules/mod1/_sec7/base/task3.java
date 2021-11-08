package modules.mod1._sec7.base;

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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        int sum = 0;
        do {
            input = in.nextInt();
            if (9 < input && input < 100) sum += SumOfDigits(input);
        } while (9 < input && input < 100);
        System.out.println(sum);
    }
}
