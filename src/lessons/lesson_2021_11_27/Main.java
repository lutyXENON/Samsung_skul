package lessons.lesson_2021_11_27;


import java.util.*;

abstract class Bike {
    Integer diameter;
    String owner;

    Bike(int diameter) {
        this.diameter = diameter;
    }

    public void buy(String owner) {
        this.owner = owner;
        System.out.println("You bought this bike!");
    }

    public void printInfo() {
        System.out.println("Bike's owner: " + owner + ", wheels diameter: " + diameter);
    }

    abstract byte getWheelsNum();

    abstract void use();

    abstract void assemble(); // собрать

}

class BikeWith1Wheel extends Bike {

    BikeWith1Wheel(int diameter) {
        super(diameter);
    }

    @Override
    public byte getWheelsNum() {
        return 1;
    }

    @Override
    public void use() {
        System.out.println("You have used this 1-wheels bike. You didn't crashed?)");
    }

    @Override
    public void assemble() {
        System.out.println("You assembled this 1-wheels bike. It was easy");
    }
}

class BikeWith2Wheels extends Bike {

    BikeWith2Wheels(int diameter) {
        super(diameter);
    }

    @Override
    public byte getWheelsNum() {
        return 2;
    }

    @Override
    public void use() {
        System.out.println("You have used this 2-wheels bike");
    }

    @Override
    public void assemble() {
        System.out.println("You assembled this 2-wheels bike");
    }
}

class BikeWith3Wheels extends Bike {
    enum Type {
        CHILD, CARGO
    }

    public Type type;

    public BikeWith3Wheels(int diameter, Type type) {
        super(diameter);
        this.type = type;
    }

    @Override
    public byte getWheelsNum() {
        return 3;
    }

    @Override
    public void printInfo() {
        System.out.println("Bike's owner: " + owner + ", wheels diameter: " + diameter + ", type: " + type);
    }

    @Override
    public void use() {
        System.out.print("You have successful used this 3-wheels bike. ");
        switch (type) {
            case CARGO:
                System.out.println("You took the load home");
                break;
            case CHILD:
                System.out.println("You drove around our house very quickly");
                break;
        }
    }

    @Override
    public void assemble() {
        System.out.println("You assembled this 3-wheels bike. You were assembling it for 3 hours");
    }
}


class Workshop {
    static public void repair(Bike bike) {
        System.out.println("Worker has repaired your " + bike.getWheelsNum() + "-wheels bike");
    }
}


public class Main {
    public static List<Bike> sortByParam(ArrayList<Bike> list) {
        List<Bike> ansList = new ArrayList<>();
        int min;
        ArrayList<Integer> param = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) param.add(list.get(i).diameter);

        while (list.size() > 0) {
            list.indexOf(list.stream().min())
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Bike> bikes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int wheelsNum = (new Random().nextInt(3) + 1);
            switch (wheelsNum) {
                case 1:
                    bikes.add(new BikeWith1Wheel(new Random().nextInt(100) + 1));
                    bikes.get(i).buy("You");
                    break;
                case 2:
                    bikes.add(new BikeWith2Wheels(new Random().nextInt(100) + 1));
                    bikes.get(i).buy("You");
                    break;
                case 3:
                    bikes.add(new BikeWith3Wheels(new Random().nextInt(100) + 1, BikeWith3Wheels.Type.CARGO));
                    bikes.get(i).buy("You");
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (bikes.get(i).getWheelsNum() == 1) Workshop.repair(bikes.get(i));
        }

        bikes.sort(Comparator.comparing(o -> o.diameter));
    }
}
