package arrays;

public class ProblemOnArrays {
    public static void main(String[] args) {
        int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};

        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println("Sum is: " +sum);
    }
}
