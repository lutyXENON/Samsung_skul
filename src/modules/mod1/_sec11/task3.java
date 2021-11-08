package modules.mod1._sec11;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mtr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mtr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                if (mtr[i][j] != mtr[j][i]) {
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
}
