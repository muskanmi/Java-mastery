package basics2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: "+ age);

        float firstNum = sc.nextFloat();
        long secondNum = sc.nextLong();
        int result = (int)(firstNum + secondNum);
        float result2 = firstNum + secondNum;
        System.out.println(result);
        System.out.println(result2);
        sc.close();
    }
}
