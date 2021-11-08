package modules.mod1.strings;

import java.util.Scanner;

public class task2 {
    public static char changeRegister(char c) {
        String s = "" + c;
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        if (upperCase.indexOf(c) != -1) return s.toLowerCase().charAt(0);
        return s.toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        System.out.println(changeRegister(c));
    }
}
