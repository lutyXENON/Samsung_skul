package tryes;

import java.util.Scanner;

public class try100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                a[i][j] = 2;
                a[i][n - i - 1] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }
    }
}

