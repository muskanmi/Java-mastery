package oops1;

import java.lang.module.Configuration;

public class LearnConstructors {
    public static void main(String[] args) {
//        Complex c1 = new Complex();  default constructor
        Complex c1 = new Complex(4, 1);
        c1.print();
    }
}

class Complex {
    int a, b;

    // default constructor. java always calls it if we are not writing.
//    public Complex() {
//        a=0;
//        b=0;
//    }

//    public Complex() { // this is also default constructor
//        a=5;
//        b=9;
//    }

    public Complex(int real, int imag) {
        a = real;
        b = imag;
    }

    void print() {
        System.out.println(a + " + "+b+"i");
    }
}
