package exceptionHandling;

public class FinallyBlockInException {
    public static void main(String[] args) {
        int a[] = new int[5];

        try{
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("I will run always"); // always run this block no matter exception occurs or not
        }
    }
}
