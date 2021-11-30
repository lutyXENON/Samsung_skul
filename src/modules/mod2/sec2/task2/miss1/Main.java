package modules.mod2.sec2.task2.miss1;


import java.util.Scanner;

class Time {
    int hour, min, sec;
    // YOUR CODE will be placed HERE

    public Time(int sec) {
        this.hour = sec / 60 / 60;
        this.min = sec % 3600 / 60;
        this.sec = sec % 60;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}

class Example{
    final int CONST = 3;
    public static void main(String[] args){
        double rand = Math.random();
        System.out.println(Double.toHexString(rand));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Time time = new Time(in.nextInt());
        System.out.println(time);
    }

}
