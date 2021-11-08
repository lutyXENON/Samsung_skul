package modules.mod1._sec7.base;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 26; i < n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
