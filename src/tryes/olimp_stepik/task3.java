package tryes.olimp_stepik;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String input = in.next();
        StringBuilder ans = new StringBuilder("0 ");
        int count = 1;
        for (char i : input.toCharArray()) {
            if (i == 'L') {
                ans.insert(0, ' ');
                ans.insert(0, count);
            } else {
                ans.append(count).append(" ");
            }
            count++;
        }
        String result = ans.toString().trim();
        System.out.println(result);
    }
}
