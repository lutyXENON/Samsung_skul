package modules.mod1.strings;

import java.util.Objects;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(Objects.equals(new StringBuilder(s).reverse().toString(), s) ? "yes" : "no");
    }
}
