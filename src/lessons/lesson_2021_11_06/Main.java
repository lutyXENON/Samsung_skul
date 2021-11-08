package lessons.lesson_2021_11_06;

class Figure {
    enum Color {
        BLUE, GREEN, RED
    }

    int angles;
    Color color;
    protected int nose;
    public void draw() {
        System.out.print("Рисуем " + angles + "-угольник");
        System.out.print(".");
        System.out.print(".");
        System.out.println(".");
        System.out.println("Готово.");
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    Figure(int angles, Color color) {
        this.angles = angles;
        this.color = color;
    }
}

class Circle extends Figure {
    int diameter;

    Circle(int angles, Color color, int diameter) {
        super(angles, color);
        this.diameter = diameter;
    }

    public void drawSquare() {
        System.out.print("Рисуем квадрат");
        System.out.print(".");
        System.out.print(".");
        System.out.println(".");
        System.out.println("Готово.");
    }
}

class Square extends Figure {
    int width;

    Square(int angles, Color color, int width) {
        super(angles, color);
        this.width = width;
    }

    public void drawSquare() {
        System.out.print("Рисуем квадрат");
        System.out.print(".");
        System.out.print(".");
        System.out.println(".");
        System.out.println("Готово.");
    }
}


public class Main {

}

