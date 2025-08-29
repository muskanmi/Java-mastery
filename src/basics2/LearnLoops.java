package basics2;

import java.util.Scanner;

public class LearnLoops {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++) {
            System.out.println("Hello World!");
        }

        // table of 3 code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
//            System.out.println(i*n);
            System.out.println(n +" * "+i+" = "+ i*n);
        }
    }
}
