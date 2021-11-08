package modules.mod1._sec7.base;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = Integer.toBinaryString(n);
        System.out.println(ans.length());
    }
}
