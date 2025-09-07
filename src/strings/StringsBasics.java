package strings;

public class StringsBasics {
    public static void main(String[] args) {
        String name = "Muskan"; // first way using string literal
        String name2 = new String("Muskan"); // second way by using new keyword
        String samename = "Muskan"; // both name and samename is pointing to same reference of muskan. No new memory is create 2 times.
        System.out.println(name);

        System.out.println(name == samename); // always give true because of same pointing reference

        System.out.println(name == name2); // will give false because new object created a new memory in heap and are pointing to different

        // for comparing string values then we can use equals method of string
        if(name.equals(name2)) {
            System.out.println("name and name2 has same values");
        }
        if(name.equalsIgnoreCase(name2)){
            System.out.println("ignore case");
        }
    }
}
