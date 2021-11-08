package modules.mod1._sec8.base;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbs = new int[n];
        int[] pos = new int[n];
        int[] neg = new int[n];
        int pos_count = 0, neg_count = 0;
        for (int i = 0; i < n; i++) {
            numbs[i] = in.nextInt();
            if (numbs[i] >= 0) {
                pos[pos_count] = numbs[i];
                pos_count++;
            } else {
                neg[neg_count] = numbs[i];
                neg_count++;
            }
        }
        for (int i : neg) {
            if (i < 0 && n > 0) {
                System.out.print(i + " ");
                n--;
            }

        }
        for (int i : pos) {
            if (i >= 0 && n > 0) {
                System.out.print(i + " ");
                n--;
            }
        }
    }
}
