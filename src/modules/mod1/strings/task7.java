package modules.mod1.strings;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x_ans = 0, y_ans = 0;
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String[] coors = s.split(" ");
            switch (coors[0]) {
                case ("North"):
                    y_ans += Integer.parseInt(coors[1]);
                    break;
                case ("South"):
                    y_ans -= Integer.parseInt(coors[1]);
                    break;
                case ("East"):
                    x_ans += Integer.parseInt(coors[1]);
                    break;
                case ("West"):
                    x_ans -= Integer.parseInt(coors[1]);
                    break;
            }
        }
        System.out.println(x_ans + " " + y_ans);
    }
}
