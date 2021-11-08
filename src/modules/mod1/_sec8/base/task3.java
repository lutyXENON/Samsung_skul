package modules.mod1._sec8.base;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input % 2 != 0 ) {
                sum += input;
                count++;
            }
        }
//        System.out.println(sum + " " + count);
        System.out.printf(sum == 0 ? "NO" : "%.2f", sum / count);
    }
}
