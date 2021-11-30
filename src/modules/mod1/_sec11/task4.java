package modules.mod1._sec11;

import java.util.Scanner;

public class task4 {
    public static String printing(int number) {
        int length = String.valueOf(number).length();
        return String.valueOf(number) + ' ' * (4 - length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(printing(i * j));
            }
            System.out.println();
        }
    }
}
