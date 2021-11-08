package modules.mod1._sec7.base;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            if (n % 10 % 2 == 1) {
                System.out.println(n % 10);
                return;
            }
            n /= 10;
        }
        System.out.println("NO");
    }
}
