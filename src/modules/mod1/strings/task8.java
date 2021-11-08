package modules.mod1.strings;

import java.util.Objects;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s_mod = s.replace(" ", "");
        System.out.println(Objects.equals(new StringBuilder(s_mod).reverse().toString(), s_mod) ? "yes" : "no");
    }
}
