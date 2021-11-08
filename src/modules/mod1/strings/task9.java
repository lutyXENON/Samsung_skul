package modules.mod1.strings;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char i : s.toCharArray()) {
            int ind = alf.indexOf(i) - k;
            System.out.print(alf.charAt(ind >= 0 ? ind : alf.length() + ind));
        }
    }
}
