package oops1;

public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
    }
}

class Dog {
    String name;
    int age;
    String color;

    void walk() {
        System.out.println("Dog is walking");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}
