package modules.mod1._sec7.base;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        int input = in.nextInt();
        while (input >= 0){
            count++;
            input = in.nextInt();
        }
        System.out.println(count);
    }
}
