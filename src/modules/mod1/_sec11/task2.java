package modules.mod1._sec11;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) System.out.print(0 + " ");
                else if (i + j > n - 1) System.out.print(2 + " ");
                else System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
