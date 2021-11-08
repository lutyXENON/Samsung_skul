package modules.mod1.strings;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);
    }
}
