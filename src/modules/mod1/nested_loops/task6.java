package modules.mod1.nested_loops;

import java.util.Scanner;

import static java.lang.Math.abs;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp, len = 1;
        int max_len = len;
        inp = in.nextInt();
        int prev = inp;
        do {
            inp = in.nextInt();
            if (inp > prev || inp < prev) {
                len++;
            } else len = 1;
            if (len > max_len) max_len = len;
            prev = inp;
        } while (inp > 0);
        System.out.println(max_len);
    }
}
