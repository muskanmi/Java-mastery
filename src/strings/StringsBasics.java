package strings;

public class StringsBasics {
    public static void main(String[] args) {
        String name = "Muskan"; // first way using string literal
        String name2 = new String("Anuj"); // second way by using new keyword
        String samename = "Muskan"; // both name and samename is pointing to same reference of muskan. No new memory is create 2 times.
        System.out.println(name);

        System.out.println(name == samename); // always give true because of same pointing reference
    }
}
