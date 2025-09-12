package oops1;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet g1 = new Greet();
        g1.greetings();
        g1.greetings("Muskan");
    }
}

class Greet {
    void greetings() {
        System.out.println("Hello, Good morning");
    }

//    int greetings() {
//        // not allowed this function
//    }

    void greetings(String name) {
        System.out.println("Hello " + name + " Good morning");
    }


    //    int greetings(String color) {
//        // not allowed this function
//    }
}
