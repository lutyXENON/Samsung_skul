package modules.mod2.sec1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();

        System.out.println(Long.toBinaryString(x));
        System.out.println(Long.toOctalString(x));
        System.out.println(Long.toHexString(x));

        System.out.println(Byte.MIN_VALUE <= x && x <= Byte.MAX_VALUE ? "YES" : "NO");
        System.out.println(Short.MIN_VALUE <= x && x <= Short.MAX_VALUE ? "YES" : "NO");
    }
}