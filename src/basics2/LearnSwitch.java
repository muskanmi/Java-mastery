package basics2;

import java.util.Scanner;

public class LearnSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        switch(day) {
            case 1: // case 1: case 2: (if I want in both cases same work should run)
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }


        int time = 21;
        if(time >= 10 && time <= 20) {
            System.out.println("Office is Open");
        } else {
            System.out.println("Office is Closed");
        }
    }
}
