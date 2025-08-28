package basics2;

public class IfElse {
    public static void main(String[] args) {
        int age = 4;
        if(age >= 18) {
            System.out.println("You can vote");
            System.out.println("good morning");
        } else {
            System.out.println("You cannot vote");
        }

        int day = 2;
        if(day == 1) {
            System.out.println("Go to home");
        } else if (day == 2) {
            System.out.println("Go to village");
        }
        else {
            System.out.println("Go to office");
        }

        // you are given three numbers, find maximum numbers

        int a = 14;
        int b=8;
        int c=1;

        if(a>b) {
            System.out.println("a is bigger than b");
            if(a > c) {
                System.out.println("a is bigger than c");
                System.out.println("a is larget "+a);
            } else {
                System.out.println("c is bigger than a");
                System.out.println("c is largest "+c);
            }
        } else {
            System.out.println("b is bigger than a");
            if(b>c){
                System.out.println("b is bigger than c");
                System.out.println("b is largest " +b);
            } else {
                System.out.println("c is bigger than b");
                System.out.println("c is largest "+c);
            }
        }
    }
}
