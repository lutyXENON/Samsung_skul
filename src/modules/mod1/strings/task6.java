package modules.mod1.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, 0);
        }
        for (char i : s.toCharArray()) {
            map.put(i, map.get(i) + 1);
            if (map.get(i) > 1) {
                System.out.println(i);
                return;
            }
        }

    }
}
