package modules.mod1._sec9.base;

import java.util.Locale;
import java.util.Scanner;

public class task4 {
    public static String BinFraction(Double x, int n) {
        String ans = "";
        x -= x.intValue();
        for (int i = 0; i < n; i++) {
            x *= 2;
            ans += x.intValue();
            x -= x.intValue();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.UK);
        double x = in.nextDouble();
        int n = in.nextInt();
        System.out.println(BinFraction(x, n));
    }
}
