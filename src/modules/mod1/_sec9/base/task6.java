package modules.mod1._sec9.base;

import java.util.Scanner;

public class task6 {
    public static int[] minToBegin(int[] m) {
        int min = Integer.MAX_VALUE;
        int min_i = -1;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
                min_i = i;
            }
        }
        for (int i = min_i; i > 0; i--) {
            m[i] = m[i - 1];
        }
        m[0] = min;
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        for (int i : minToBegin(mas)) System.out.print(i + " ");
    }
}
