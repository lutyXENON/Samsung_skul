package modules.mod1._sec11;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mtr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mtr[i][j] = in.nextInt();
            }
        }
        System.out.println(m + " "+ n);
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(mtr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
