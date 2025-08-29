package basics2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        infinite while loop
        int i = 0;
//        while( i <5) {
//            System.out.println(i);
//        }

        while(i<5) {
            System.out.println(i);
            i++;
        }

//        when we do not know how many times the loop will learn. In that case we should use while loop always.
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        while(!hasLearnt) {
            System.out.println("Went to school, tried to learn");
            System.out.println("Have you understood? ");
            hasLearnt = sc.nextBoolean();
        }

        int n = 8;
        while(n<=5) {
            System.out.println(n);
            n++;
        }

        do {
            System.out.println(n);
            n++;
        }while (n <= 5);
        System.out.println("Out of loop");

    }
}
