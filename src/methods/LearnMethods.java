package methods;

public class LearnMethods {
    public static void main(String[] args) {
        greet();
        average(3, 4);
    }

    public static void greet() {
        System.out.println("Hello Method");
    }

    public static void average(int a,  int b) {
        int avg = (a+b)/2;
        System.out.println("The average is: "+avg);
    }
}
