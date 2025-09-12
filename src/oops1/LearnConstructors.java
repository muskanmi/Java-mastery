package oops1;

import java.lang.module.Configuration;

public class LearnConstructors {
    public static void main(String[] args) {
//        Complex c1 = new Complex();  default constructor
        Complex c1 = new Complex(4, 1);
        Complex c2 = new Complex(2, 4);
        c1.print();
        c2.print();
        Complex res = c1.add(c2);
        res.print();
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

    // using this keyword using same name
//    public Complex(int a, int b){
//        this.a = a;
//        this.b = b;
//    }

    public Complex(int real){
        a = real;
        b = 12;
    }

    void print() {
        System.out.println(a + " + "+b+"i");
    }

    Complex add(Complex num2) {
        return new Complex(a+num2.a, b+num2.b);
    }
}
