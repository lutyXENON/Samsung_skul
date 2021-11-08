package modules.mod1.nested_loops;

import java.util.Scanner;

public class task3 {
    public static boolean isEasy(int n) {
        for (int i = 2; i < n / 2; i++) {
            if ((n % i) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (isEasy(i)) {
                System.out.print(i + " ");
                counter++;
            }
        }
        if (counter == 0) System.out.println(0);
    }
}
