package tryes;

import java.util.Scanner;

public class try3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int m = 2 * n + 1;
        int x = n + 1;
        int y = n + 1;
        int k = 0;
        for (int z = 1; z < m * m; z++) {
            a[x][y] = z - 1;

        }
    }
}
