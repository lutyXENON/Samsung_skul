package modules.mod1.strings;

import java.util.Scanner;

public class task1 {
    public static boolean IsDigit(char c) {
        char[] numbs = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (char i : numbs) {
            if (c == i) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        System.out.println(IsDigit(c) ? "yes" : "no");
    }
}
