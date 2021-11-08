package modules.mod1._sec11;

import java.util.Scanner;

public class task5 {
    public static String spaces(int n) {
        int len = String.valueOf(n).length();
        return (' ' * (3 - len) + "" + n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mtr = new int[n][m];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int print = i % 2 == 0 ? counter : n * m - counter;
                System.out.print(spaces(print) + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
