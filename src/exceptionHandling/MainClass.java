package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            System.out.println(a[8]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access but gave out of bound");
        }

        System.out.println("Hello guyz"); // not printed (runtime exception)
    }
}
