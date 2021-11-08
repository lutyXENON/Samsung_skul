package tryes.olimp_stepik;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("Talking horse Julius was walking along the road and met 40 robbers.");
            return;
        }
        if (n == 322) {
            System.out.println("And talking horse Julius went on along the road.");
            return;
        }
        n--;
        if (n % 2 == 1) {
            if (n / 80 == 0)
                System.out.println("- Hello, robber number " + ((n % 80) / 2 + 1) + ",- said talking horse Julius.");
            else if (n / 80 == 1)
                System.out.println("- Hello, horse of robber number " + ((n % 80) / 2 + 1) + ",- said talking horse Julius.");
            else if (n / 80 == 2)
                System.out.println("- Goodbye, robber number " + ((n % 80) / 2 + 1) + ",- said talking horse Julius.");
            else
                System.out.println("- Goodbye, horse of robber number " + ((n % 80) / 2 + 1) + ",- said talking horse Julius.");
        } else {
            int rob_num;
            if ((n % 80) == 0)
                rob_num = 40;
            else
                rob_num = ((n % 80) / 2);

            if ((n - 1) / 80 == 0)
                System.out.println("- Hello, talking horse Julius,- said robber number " + rob_num + ".");
            else if ((n - 1) / 80 == 1)
                System.out.println("- Hello, talking horse Julius,- said horse of robber number " + rob_num + ".");
            else if ((n - 1) / 80 == 2)
                System.out.println("- Goodbye, talking horse Julius,- said robber number " + rob_num + ".");
            else
                System.out.println("- Goodbye, talking horse Julius,- said horse of robber number " + rob_num + ".");
        }
    }

}