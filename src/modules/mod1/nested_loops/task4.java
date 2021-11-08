package modules.mod1.nested_loops;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();
        int[] a_ans = new int[n / a];
        int[] b_ans = new int[n / a];
        int[] c_ans = new int[n / a];
        int count = 0;
        for (int i = 0; i < n / a - 1; i++) {
            for (int j = 0; j < n / a - 1; j++) {
                for (int k = 0; k < n / a - 1; k++) {
                    if (a * i + b * j + c * k == n) {
                        a_ans[count] = i;
                        b_ans[count] = j;
                        c_ans[count] = k;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(a_ans[i] + " " + b_ans[i] + " " + c_ans[i]);
        }
    }
}
