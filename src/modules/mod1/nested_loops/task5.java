package modules.mod1.nested_loops;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int inp, counter = 0;
        do {
            inp = in.nextInt();
            if (max < inp) {
                max = inp;
                counter = 1;
            } else if (max == inp) counter++;
        } while (inp > 0);
        System.out.println(counter);
    }
}
