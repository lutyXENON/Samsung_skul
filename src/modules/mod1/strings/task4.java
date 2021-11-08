package modules.mod1.strings;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.split(" ");
        int max_len = 0;
        String max_len_word = "";
        for (String word : words) {
            if (word.length() > max_len) {
                max_len = word.length();
                max_len_word = word;
            }
        }
        System.out.println(max_len_word + "\n" + max_len);
    }
}
