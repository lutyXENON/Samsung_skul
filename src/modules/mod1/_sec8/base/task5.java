package modules.mod1._sec8.base;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = in.nextInt();
        }
        int count = (n & 2) == 0 ? n / 2 : n / 2 - 1;
        for (int i = 0; i < count + 1; i++) {
            int cur = m[i];
            m[i] = m[n - i - 1];
            m[n - i - 1] = cur;
        }
        for (int i : m) {
            System.out.print(i + " ");
        }
    }
}
