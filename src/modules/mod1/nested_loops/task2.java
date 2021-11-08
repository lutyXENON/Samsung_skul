package modules.mod1.nested_loops;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int counter = 0;
        while (a != 0 && b != 0) {
            if (a > b) a -= b;
            else b -= a;
            counter++;
        }
        System.out.println(a + b + " " + counter);
    }
}
