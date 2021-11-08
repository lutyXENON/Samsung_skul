package modules.mod1._sec7.base;

import java.util.Scanner;

public class task4 {
    public static int[] SuperDiv(int a, int b){
        int init = a;
        int[] ans = new int[2];
        while (a >= b){
            a -= b;
            ans[0]++;
        }
        ans[1] = init - ans[0] * b;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i : SuperDiv(a, b)) System.out.print(i + " ");
    }
}
