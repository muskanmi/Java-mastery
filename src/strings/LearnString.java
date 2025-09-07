package strings;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String firstName = sc.nextLine();
//        // sc.next() will not take full sentence. it will just take only one word.
//
//        System.out.println("Enter your last name");
//        String lastName = sc.nextLine();
//
//        System.out.println("Your full name is " + firstName + " " + lastName);

        String name = "aNuJ23";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("Carpet".startsWith("Bike"));
        System.out.println("Carpet".endsWith("pet"));
        System.out.println("Carpet".charAt(3)); // most useful methods in DSA

        int age = 30;
        String newAge = String.valueOf(age);
        System.out.println(newAge);
        System.out.println(age+2);
        System.out.println(newAge + 2);

        String sentence = "I love Java, Java is a good language";
        String words[] = sentence.split(" ");
        for(String word: words) {
            System.out.println(word);
        }

    }
}
