package modules.mod1._sec7.base;

import java.util.Scanner;

public class task10 {
    public static boolean isEasy(int n) {
        for (int i = 2; i < n / 2; i++) {
            if ((n % i) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n++;
        while (!isEasy(n)) n++;
        System.out.println(n);
    }
}
