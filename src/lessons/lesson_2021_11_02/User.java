package lessons.lesson_2021_11_02;

public class User {
    private int age;
    private String name;
    private String id;
    private boolean isOnline;

    User(String name, int age, String id) { // конструктор инициализирования
        this.name = name;
        this.age = age;
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printInfo() {
        System.out.println("name = " + name + ", " +
                "age = " + age + ", " +
                "id = " + id + ", " +
                "isOnline = " + isOnline);
    }
}
