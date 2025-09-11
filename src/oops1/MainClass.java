package oops1;

public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();
    }
}

class Dog {
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name + " is walking");
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}
