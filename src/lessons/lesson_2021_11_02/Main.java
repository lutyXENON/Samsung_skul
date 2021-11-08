package lessons.lesson_2021_11_02;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Vova", 20, "0001");
        user1.printInfo();
        // user1.age = 21; // так делать нежелательно
        user1.setAge(22); // так желательно
        System.out.println(user1.getAge());
    }
}
