package modules.mod1._sec8.base;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        int cur = 4;
        for (int i = 0; i < n; i++) {
            m[i] = cur;
            cur += 3;
            System.out.print(m[i] + " ");
        }

    }
}
