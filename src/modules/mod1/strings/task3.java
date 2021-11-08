package modules.mod1.strings;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int counter = 1;
        for (char i : s.toCharArray()) {
            if (i == ' ') counter++;
        }
        System.out.println(counter);
    }
}
