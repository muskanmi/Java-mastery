package genericAndWrapperClasses;

public class GenericMethods {

    public static void main(String[] args) {
        printData("Hello");
    }

    static <E> void printData(E data) {
        System.out.println(data);
    }
}
