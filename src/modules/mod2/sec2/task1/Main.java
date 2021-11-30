package modules.mod2.sec2.task1;

import java.util.Locale;

class Vector2D {
    public double vX, vY;

    public Vector2D() {
        vX = 1;
        vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vector) {
        this.vX = vector.vX;
        this.vY = vector.vY;
    }

    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }

}

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1.456, 2.699);
        Vector2D v2 = new Vector2D(v1);
        v1.print();
        v2.print();
    }
}
