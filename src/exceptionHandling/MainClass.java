package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println(a[8]);

        System.out.println("Hello guyz"); // not printed (runtime exception)
    }
}
