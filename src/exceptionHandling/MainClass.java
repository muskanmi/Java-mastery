package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            int res = 5/0;

            System.out.println(a[8]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access but gave out of bound");
        } catch (ArithmeticException e){
            System.out.println("gave arithmetic exception");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        System.out.println("Hello guyz"); // not printed (runtime exception)
    }
}
