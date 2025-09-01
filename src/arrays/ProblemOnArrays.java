package arrays;

public class ProblemOnArrays {
    public static void main(String[] args) {
//        int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};
//
//        // sum of the number
//        int sum = 0;
//        for(int num: numbers){
//            sum += num;
//        }
//        System.out.println("Sum is: " +sum);


        // find minimum from all numbers
//        int min = Integer.MAX_VALUE;
//        for (int num: numbers){
//            if(num < min) {
//                min = num;
//            }
//        }
//
//        System.out.println("Minimum number is: "+min);


        // 2D-ARRAY

        int marks[][] = new int[4][3];
        marks[0][0] = 12;
        marks[0][1] = 98;
        marks[0][2] = 34;

        marks[1][0] = 12;
        marks[1][1] = 67;
        marks[1][2] = 87;

        marks[2][0] = 12;
        marks[2][1] = 98;
        marks[2][2] = 34;

        marks[3][0] = 12;
        marks[3][1] = 67;
        marks[3][2] = 87;

//        int mark[][] = {
//                {12, 98, 34},
//                {12, 67, 87},
//                {12, 98, 23},
//                {12, 67, 87}
//        };

        System.out.println(marks[2][1]);
    }
}
