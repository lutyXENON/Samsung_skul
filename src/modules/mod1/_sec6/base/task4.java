package modules.mod1._sec6.base;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        double c = -b / a;
        String n = String.format("%.1f", c);
        if (a > 0) {
            if (b > 0) System.out.println("any x");
            else if (b < 0) System.out.println("x<-" + n + " or x>" + n);
            else System.out.println("any x");
        } else if (a < 0) {
            if (b > 0) System.out.println("-" + n + "<x<" + n);
            else if (b < 0) System.out.println("no such x");
            else System.out.println("no such x");
        } else {
            if (b > 0) System.out.println("any x");
            else if (b < 0) System.out.println("no such x");
            else System.out.println("no such x");
        }

    }
}
