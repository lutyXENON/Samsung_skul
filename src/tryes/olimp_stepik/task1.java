package tryes.olimp_stepik;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double u = in.nextDouble();
        double v = u / 3.6;
        int time = (int) Math.round(1000 / v);
        System.out.println(time / 60 + " " + time % 60);
    }
}
