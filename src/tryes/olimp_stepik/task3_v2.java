package tryes.olimp_stepik;

import java.util.Scanner;

class task3_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String input = in.next();
        StringBuilder ans = new StringBuilder();
        int count = n - 1;
        for (char i : new StringBuilder(input).reverse().toString().toCharArray()) {
            if (i == 'L') {
                ans.append(count).append(" ");
            }
            count--;
        }
        ans.append("0 ");
        count = 1;
        for (char i : input.toCharArray()) {
            if (i == 'R') {
                ans.append(count).append(" ");
            }
            count++;
        }
        String result = ans.toString().trim();
        System.out.println(result);
    }
}
