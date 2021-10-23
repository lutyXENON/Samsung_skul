package lesson_2021_10_23;

class magic_with_references {
    public static void main(String[] args) {
        A ref1 = new A(4); // лежит в куче
        ref1.a = 1;

        A ref2 = ref1; // на один объект может ссылаться мн-во ссылок
        ref2.a = 5;

//        doSmth(ref1);
        System.out.println(ref1.a);
        System.out.println(ref2.a);
    }

    static void doSmth(A ref3copied) { // происходит копирование
        ref3copied.a = 5; // обращение к той же области памяти уже через другую ссылку
        // то есть, в джаве всегда передача параметров происходит ПО ЗНАЧЕНИЮ,
        // а данный пример иллюстрирует то, что не самые умные люди называют
        // передачей ПО ССЫЛКЕ
    }
}

class A {
    int a;

    public A(int a) {
        this.a = a;
    }
}