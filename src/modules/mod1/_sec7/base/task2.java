package modules.mod1._sec7.base;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        int sum = 0;
        do {
            input = in.nextInt();
            if (input > 10) sum += input;
        } while (input % 5 != 0);
        System.out.println(sum);
    }
}
