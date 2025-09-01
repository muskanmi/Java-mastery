package arrays;

public class BasicsOfArray {
    public static void main(String[] args) {
        int age[]; // declaration
        age = new int[5]; // initialization

//        another way is -
        int age2[] = new int[5];

        age[0] = 5;
        age[1] = 2;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        System.out.println(age.length);
        System.out.println(age2.length);

        // directly initialized array
        int marks[] = {98, 12, 45, 12, 65};
        System.out.println(marks[0]);
    }
}
