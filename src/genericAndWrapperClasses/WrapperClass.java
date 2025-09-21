package genericAndWrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {

        Integer obj = new Integer(12);

        Integer obj2 = Integer.valueOf(12);

        Integer obj4 = Integer.valueOf("12"); // converts 12 in integer
        System.out.println(obj4 * 4);

        Integer obj3 = 12; // autoboxing

        int age = obj;
    }
}
