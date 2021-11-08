package tryes;

import java.util.Scanner;

public class try101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) m[i] = in.nextInt();
        int x = in.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (m[i] == x) {
                System.out.print(i + 1 + " ");
                cnt++;
            }
        }
        if (cnt == 0) System.out.println(-1);
    }
}
